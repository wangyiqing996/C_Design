package com.example.c_design.controller;

import com.example.c_design.domain.Belong;

import com.example.c_design.req.BelongQueryReq;

import com.example.c_design.resp.CommonResp;
import com.example.c_design.service.BelongService;
import com.example.c_design.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/belong")
public class BelongController {


    @Resource
    private BelongService belongService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Belong>> resp = new CommonResp<>();
        List<Belong> list = belongService.list();
        resp.setContent(list);
        return resp;
    }


    //删除
    @DeleteMapping("/delete/{sId}/{uId}")
    public CommonResp delete(@PathVariable Long sId, @PathVariable Long uId) {
        CommonResp resp = new CommonResp<>();
        belongService.delete(sId, uId);
        return resp;
    }


    //新增
    @PostMapping("/add")
    public CommonResp add(@Valid @RequestBody BelongQueryReq req) {
        CommonResp resp = new CommonResp<>();
        belongService.add(req);
        return resp;
    }


    //修改
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody BelongQueryReq req) {
        CommonResp resp = new CommonResp<>();
        belongService.save(req);
        return resp;
    }

}
