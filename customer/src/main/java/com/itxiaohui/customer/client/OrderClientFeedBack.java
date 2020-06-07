package com.itxiaohui.customer.client;

import com.itxiaohui.customer.model.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class OrderClientFeedBack implements OrderClient{

    @Override
    public CommonResult getOrderList() {
        return new CommonResult("500","系统繁忙！");
    }
}
