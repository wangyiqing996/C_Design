package com.example.c_design.service;


import com.example.c_design.domain.Belong;
import com.example.c_design.domain.BelongExample;
import com.example.c_design.domain.Goods;
import com.example.c_design.mapper.BelongMapper;
import com.example.c_design.req.BelongQueryReq;
import com.example.c_design.resp.BelongQueryResp;
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
public class BelongService {

    private static final Logger LOG = LoggerFactory.getLogger(BelongService.class);

    @Resource
    private BelongMapper belongMapper;

    @Resource
    private SnowFlake snowFlake;

    public List<Belong> list() {
        return belongMapper.selectByExample(null);
    }

    public PageResp<BelongQueryResp> list(BelongQueryReq req) {
          BelongExample belongExample = new BelongExample();
//        StockExample.Criteria criteria = stockExample.createCriteria();

        List<Belong> belongList = belongMapper.selectByExample(belongExample);

        PageInfo<Belong> pageInfo = new PageInfo<>(belongList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        // 列表复制
        List<BelongQueryResp> list = CopyUtil.copyList(belongList, BelongQueryResp.class);

        PageResp<BelongQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;
    }


    /**
     * 增加
     */
    public void add(BelongQueryReq req) {
        Belong belong = CopyUtil.copy(req, Belong.class);
//        buy.setId(snowFlake.nextId());
        belongMapper.insert(belong);
    }

    /**
     * 修改
     */

    public void save(BelongQueryReq req) {
        Belong belong = CopyUtil.copy(req, Belong.class);
        belongMapper.updateByPrimaryKey(belong);
    }

    /**
     * 删除
     */
    public void delete(Long sid,Long uid) {
        belongMapper.deleteByPrimaryKey(sid, uid);
    }



}
