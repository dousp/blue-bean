package com.dou.blue.bean.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RefreshScope
public class DemoController {

    @Value("${demo.desc}")
    private String info;
    @Value("${base.area}")
    private String area;
    @Value("${base.idc}")
    private String idc;

    @Value("${demo}")
    private String demo;


    @GetMapping("")
    public String demo() {
        return demo;
    }

    @GetMapping("meta")
    public String meta() {
        return info + "==" + area + "==" + idc;
    }

}
