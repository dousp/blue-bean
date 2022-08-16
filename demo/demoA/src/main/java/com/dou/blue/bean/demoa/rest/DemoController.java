package com.dou.blue.bean.demoa.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RefreshScope
public class DemoController {

    @Value("${base.desc}")
    private String info;
    @Value("${base.area}")
    private String area;
    @Value("${base.idc}")
    private String idc;


    @GetMapping("")
    public String demo() {
        return info;
    }

    @GetMapping("/meta")
    public String meta() {
        return info + "==" + area + "==" + idc;
    }

    @GetMapping("/circuitbreaker")
    public String circuitbreaker() {
        throw new RuntimeException("我访问出问题了");
    }

}
