package com.dou.blue.bean.demoa.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo-b",
        fallback = DemoFallback.class)
public interface DemoFeign {

    @GetMapping("/circuitbreaker")
    String circuitbreaker();
}
