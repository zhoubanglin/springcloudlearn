package com.itxiaohui.customer.controller;

import com.itxiaohui.customer.client.OrderClient;
import com.itxiaohui.customer.model.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer/v1")
public class TestController {
    @Autowired
    private OrderClient orderClient;
    @RequestMapping("/getOrderList")
    public CommonResult getOrderList(){
        return orderClient.getOrderList();
    }
}
