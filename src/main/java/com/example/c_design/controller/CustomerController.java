package com.example.c_design.controller;

import com.example.c_design.domain.Belong;
import com.example.c_design.domain.Customer;
import com.example.c_design.req.BelongQueryReq;
import com.example.c_design.req.CustomerQueryReq;
import com.example.c_design.resp.CommonResp;
import com.example.c_design.service.BelongService;
import com.example.c_design.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @Resource
    private CustomerService customerService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Customer>> resp = new CommonResp<>();
        List<Customer> list = customerService.list();
        resp.setContent(list);
        return resp;
    }


    //删除
    @DeleteMapping("/delete/{cId}")
    public CommonResp delete(@PathVariable Long cId) {
        CommonResp resp = new CommonResp<>();
        customerService.delete(cId);
        return resp;
    }


    //新增
    @PostMapping("/add")
    public CommonResp add(@Valid @RequestBody CustomerQueryReq req) {
        CommonResp resp = new CommonResp<>();
        customerService.add(req);
        return resp;
    }


    //修改
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody CustomerQueryReq req) {
        CommonResp resp = new CommonResp<>();
        customerService.save(req);
        return resp;
    }

}
