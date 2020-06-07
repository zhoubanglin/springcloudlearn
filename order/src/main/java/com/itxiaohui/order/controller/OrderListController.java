package com.itxiaohui.order.controller;

import com.itxiaohui.order.model.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order/v1")
public class OrderListController {
    @RequestMapping("/getOrderList")
    public CommonResult getOrderList(){
        return new CommonResult("200","ok");
    }
}
