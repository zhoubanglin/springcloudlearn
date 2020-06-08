package com.itxiaohui.customer.controller;

import com.itxiaohui.customer.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigTestController {
    @Value("${customer.config.name}")
    private String name;
    @Value("${customer.config.age}")
    private String age;
    @RequestMapping("/customer/v1/getInfo")
    public Person getInfo(){
        return new Person(name,age);
    }
}
