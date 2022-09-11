package com.example.c_design.controller;

import com.example.c_design.domain.Goods;
import com.example.c_design.domain.Store;
import com.example.c_design.req.GoodsQueryReq;
import com.example.c_design.req.StoreQueryReq;
import com.example.c_design.resp.CommonResp;
import com.example.c_design.service.GoodsService;
import com.example.c_design.service.StoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {


    @Resource
    private StoreService storeService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Store>> resp = new CommonResp<>();
        List<Store> list = storeService.list();
        resp.setContent(list);
        return resp;
    }


    //删除
    @DeleteMapping("/delete/{userId}")
    public CommonResp delete(@PathVariable Long userId) {
        CommonResp resp = new CommonResp<>();
        storeService.delete(userId);
        return resp;
    }


    //新增
    @PostMapping("/add")
    public CommonResp add(@Valid @RequestBody StoreQueryReq req) {
        CommonResp resp = new CommonResp<>();
        storeService.add(req);
        return resp;
    }


    //修改
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody StoreQueryReq req) {
        CommonResp resp = new CommonResp<>();
        storeService.save(req);
        return resp;
    }

}
