package com.dou.blue.bean.demoa.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

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

    @Resource
    private DemoFeign demoFeign;
    @Resource
    private RestTemplate restTemplate;


    @GetMapping("")
    public String demo() {
        return info;
    }

    @GetMapping("/meta")
    public String meta() {
        return info + "==" + area + "==" + idc;
    }

    @GetMapping("/getDemoBByFeign")
    public String getDemoBByFeign() {
        return demoFeign.circuitbreaker();
    }

    @GetMapping("/getDemoBByRestTemplate")
    public String getDemoBByRestTemplate() {
        return restTemplate.getForObject("demo-b/circuitbreaker", String.class);
    }

}
