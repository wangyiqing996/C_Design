package com.example.c_design.service;



import com.example.c_design.domain.Customer;
import com.example.c_design.domain.CustomerExample;
import com.example.c_design.mapper.CustomerMapper;
import com.example.c_design.req.CustomerQueryReq;
import com.example.c_design.resp.CustomerQueryResp;
import com.example.c_design.resp.PageResp;
import com.example.c_design.utils.CopyUtil;
import com.example.c_design.utils.SnowFlake;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

public class CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private SnowFlake snowFlake;

    public PageResp<CustomerQueryResp> list(CustomerQueryReq req) {
        CustomerExample customerExample = new CustomerExample();
//        StockExample.Criteria criteria = stockExample.createCriteria();

        List<Customer> customerList = customerMapper.selectByExample(customerExample);

        PageInfo<Customer> pageInfo = new PageInfo<>(customerList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        // 列表复制
        List<CustomerQueryResp> list = CopyUtil.copyList(customerList, CustomerQueryResp.class);

        PageResp<CustomerQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;
    }


    /**
     * 增加
     */
    public void add(CustomerQueryReq req) {
        Customer customer = CopyUtil.copy(req, Customer.class);
        customer.setId(snowFlake.nextId());
        customerMapper.insert(customer);
    }

    /**
     * 修改
     */

    public void save(CustomerQueryReq req) {
        Customer customer = CopyUtil.copy(req, Customer.class);
        customerMapper.updateByPrimaryKey(customer);
    }

    /**
     * 删除
     */
    public void delete(Long id) {
        customerMapper.deleteByPrimaryKey(id);
    }



}
