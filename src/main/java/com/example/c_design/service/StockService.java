package com.example.c_design.service;

import com.example.c_design.domain.Stock;
import com.example.c_design.domain.StockExample;
import com.example.c_design.domain.StoreExample;
import com.example.c_design.mapper.StockMapper;

import com.example.c_design.req.StockQueryReq;
import com.example.c_design.resp.PageResp;

import com.example.c_design.resp.StockQueryResp;
import com.example.c_design.utils.CopyUtil;
import com.example.c_design.utils.SnowFlake;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

public class StockService {

    private static final Logger LOG = LoggerFactory.getLogger(StockService.class);

    @Resource
    private StockMapper stockMapper;

    @Resource
    private SnowFlake snowFlake;

    public PageResp<StockQueryResp> list(StockQueryReq req) {
        StockExample stockExample = new StockExample();
//        StockExample.Criteria criteria = stockExample.createCriteria();

        List<Stock> stockList = stockMapper.selectByExample(stockExample);

        PageInfo<Stock> pageInfo = new PageInfo<>(stockList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        // 列表复制
        List<StockQueryResp> list = CopyUtil.copyList(stockList, StockQueryResp.class);

        PageResp<StockQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;
    }


    /**
     * 增加
     */

    //需要传输Id
    public void add(StockQueryReq req) {
        Stock stock = CopyUtil.copy(req, Stock.class);
//        stock.setsId(req.getsId());
//        stock.setgId(req.getgId());
//        stock.setsId( snowFlake.nextId());
        stockMapper.insert(stock);
    }

    /**
     * 修改
     */

    public void save(StockQueryReq req) {
        Stock stock = CopyUtil.copy(req, Stock.class);
        stockMapper.updateByPrimaryKey(stock);
    }

    /**
     * 删除
     */
    public void delete(Long gid,Long sid) {
        stockMapper.deleteByPrimaryKey(gid, sid);
    }


}
