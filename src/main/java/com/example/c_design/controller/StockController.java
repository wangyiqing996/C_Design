package com.example.c_design.controller;


import com.example.c_design.domain.Buy;
import com.example.c_design.domain.Stock;
import com.example.c_design.req.BuyQueryReq;
import com.example.c_design.req.StockQueryReq;
import com.example.c_design.resp.CommonResp;
import com.example.c_design.service.BuyService;
import com.example.c_design.service.StockService;
import com.example.c_design.service.StoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {


    @Resource
    private StockService stockService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Stock>> resp = new CommonResp<>();
        List<Stock> list = stockService.list();
        resp.setContent(list);
        return resp;
    }


    //删除
    @DeleteMapping("/delete/{gId}/{sId}")
    public CommonResp delete(@PathVariable Long gId, @PathVariable Long sId) {
        CommonResp resp = new CommonResp<>();
        stockService.delete(gId, sId);
        return resp;
    }


    //新增
    @PostMapping("/add")
    public CommonResp add(@Valid @RequestBody StockQueryReq req) {
        CommonResp resp = new CommonResp<>();
        stockService.add(req);
        return resp;
    }


    //修改
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody StockQueryReq req) {
        CommonResp resp = new CommonResp<>();
        stockService.save(req);
        return resp;
    }

}
