package com.example.c_design.service;

import com.example.c_design.domain.Buy;
import com.example.c_design.domain.BuyExample;
import com.example.c_design.domain.Goods;
import com.example.c_design.mapper.BuyMapper;
import com.example.c_design.req.BuyQueryReq;
import com.example.c_design.resp.BuyQueryResp;
import com.example.c_design.resp.PageResp;
import com.example.c_design.utils.CopyUtil;
import com.example.c_design.utils.SnowFlake;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuyService {

    private static final Logger LOG = LoggerFactory.getLogger(BuyService.class);

    @Resource
    private BuyMapper buyMapper;

    @Resource
    private SnowFlake snowFlake;

    public List<Buy> list() {
        return buyMapper.selectByExample(null);
    }

    public PageResp<BuyQueryResp> list(BuyQueryReq req) {
          BuyExample buyExample = new BuyExample();
//        StockExample.Criteria criteria = stockExample.createCriteria();

        List<Buy> buyList = buyMapper.selectByExample(buyExample);

        PageInfo<Buy> pageInfo = new PageInfo<>(buyList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        // 列表复制
        List<BuyQueryResp> list = CopyUtil.copyList(buyList, BuyQueryResp.class);

        PageResp<BuyQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;
    }


    /**
     * 增加
     */
    public void add(BuyQueryReq req) {
        Buy buy = CopyUtil.copy(req, Buy.class);
//        buy.setId(snowFlake.nextId());
        buyMapper.insert(buy);
    }

    /**
     * 修改
     */

    public void save(BuyQueryReq req) {
        Buy buy = CopyUtil.copy(req, Buy.class);
        buyMapper.updateByPrimaryKey(buy);
    }

    /**
     * 删除
     */
    public void delete(Long cid,Long gid) {
        buyMapper.deleteByPrimaryKey(cid, gid);
    }



}
