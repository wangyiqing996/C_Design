package com.example.c_design.service;

import com.example.c_design.domain.Buy;
import com.example.c_design.domain.Store;
import com.example.c_design.domain.StoreExample;
import com.example.c_design.mapper.StoreMapper;
import com.example.c_design.req.StoreQueryReq;
import com.example.c_design.resp.PageResp;
import com.example.c_design.resp.StoreQueryResp;
import com.example.c_design.utils.CopyUtil;
import com.example.c_design.utils.SnowFlake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StoreService {

    private static final Logger LOG = LoggerFactory.getLogger(StoreService.class);

    @Resource
    private StoreMapper storeMapper;

    @Resource
    private SnowFlake snowFlake;

    public List<Store> list() {
        return storeMapper.selectByExample(null);
    }

    public PageResp<StoreQueryResp> list(StoreQueryReq req) {
        StoreExample storeExample = new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();

        List<Store> storeList = storeMapper.selectByExample(storeExample);

        PageInfo<Store> pageInfo = new PageInfo<>(storeList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        // 列表复制
        List<StoreQueryResp> list = CopyUtil.copyList(storeList, StoreQueryResp.class);

        PageResp<StoreQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;
    }


    /**
     * 增加
     */
    public void add(StoreQueryReq req) {
        Store store = CopyUtil.copy(req, Store.class);
        store.setsId( snowFlake.nextId());
        storeMapper.insert(store);
    }

    /**
     * 修改
     */

    public void save(StoreQueryReq req) {
        Store store = CopyUtil.copy(req, Store.class);
        storeMapper.updateByPrimaryKey(store);
    }

    /**
     * 删除
     */
    public void delete(Long id) {
        storeMapper.deleteByPrimaryKey(id);
    }


}
