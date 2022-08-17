package com.dou.blue.bean.demob.rest;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RefreshScope
public class DemoBController {


    @GetMapping("/circuitbreaker")
    public String circuitbreaker() {
        return "我 demo B 没问题了";
        // throw new RuntimeException("我访问出问题了->demo C");
    }

}
