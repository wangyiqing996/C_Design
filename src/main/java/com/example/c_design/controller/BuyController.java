package com.example.c_design.controller;


import com.example.c_design.domain.Buy;

import com.example.c_design.req.BuyQueryReq;
import com.example.c_design.resp.CommonResp;

import com.example.c_design.service.BuyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/buy")
public class BuyController {


    @Resource
    private BuyService buyService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Buy>> resp = new CommonResp<>();
        List<Buy> list = buyService.list();
        resp.setContent(list);
        return resp;
    }


    //删除
    @DeleteMapping("/delete/{cId}/{gId}")
    public CommonResp delete(@PathVariable Long cId, @PathVariable Long gId) {
        CommonResp resp = new CommonResp<>();
        buyService.delete(cId, gId);
        return resp;
    }


    //新增
    @PostMapping("/add")
    public CommonResp add(@Valid @RequestBody BuyQueryReq req) {
        CommonResp resp = new CommonResp<>();
        buyService.add(req);
        return resp;
    }


    //修改
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody BuyQueryReq req) {
        CommonResp resp = new CommonResp<>();
        buyService.save(req);
        return resp;
    }

}
