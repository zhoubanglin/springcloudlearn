package com.itxiaohui.customer.client;

import com.itxiaohui.customer.model.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-order",fallback = OrderClientFeedBack.class)
public interface OrderClient {
    @RequestMapping("/order/v1/getOrderList")
    public CommonResult getOrderList();
}
