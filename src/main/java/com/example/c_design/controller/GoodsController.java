package com.example.c_design.controller;

import com.example.c_design.domain.Goods;
import com.example.c_design.req.GoodsQueryReq;
import com.example.c_design.resp.CommonResp;
import com.example.c_design.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {


    @Resource
    private GoodsService goodsService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Goods>> resp = new CommonResp<>();
        List<Goods> list = goodsService.list();
        resp.setContent(list);
        return resp;
    }


    //删除
    @DeleteMapping("/delete/{userId}")
    public CommonResp delete(@PathVariable Long userId) {
        CommonResp resp = new CommonResp<>();
        goodsService.delete(userId);
        return resp;
    }


    //新增
    @PostMapping("/add")
    public CommonResp add(@Valid @RequestBody GoodsQueryReq req) {
        CommonResp resp = new CommonResp<>();
        goodsService.add(req);
        return resp;
    }


    //修改
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody GoodsQueryReq req) {
        CommonResp resp = new CommonResp<>();
        goodsService.save(req);
        return resp;
    }

}
