package com.example.c_design.service;


import com.example.c_design.domain.Goods;
import com.example.c_design.domain.GoodsExample;
import com.example.c_design.mapper.GoodsMapper;
import com.example.c_design.req.GoodsQueryReq;
import com.example.c_design.resp.GoodsQueryResp;
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
public class GoodsService {

    private static final Logger LOG = LoggerFactory.getLogger(GoodsService.class);

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private SnowFlake snowFlake;


    public List<Goods> list() {
        return goodsMapper.selectByExample(null);
    }
    public PageResp<GoodsQueryResp> list(GoodsQueryReq req) {
        GoodsExample goodsExample = new GoodsExample();
//        StockExample.Criteria criteria = stockExample.createCriteria();

        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);

        PageInfo<Goods> pageInfo = new PageInfo<>(goodsList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        // 列表复制
        List<GoodsQueryResp> list = CopyUtil.copyList(goodsList, GoodsQueryResp.class);

        PageResp<GoodsQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;
    }


    /**
     * 增加
     */
    public void add(GoodsQueryReq req) {
        Goods goods = CopyUtil.copy(req, Goods.class);
        goods.setgId(snowFlake.nextId());
        goodsMapper.insert(goods);
    }

    /**
     * 修改
     */

    public void save(GoodsQueryReq req) {
        Goods goods = CopyUtil.copy(req, Goods.class);
        goodsMapper.updateByPrimaryKey(goods);
    }

    /**
     * 删除
     */
    public void delete(Long id) {
        goodsMapper.deleteByPrimaryKey(id);
    }



}
