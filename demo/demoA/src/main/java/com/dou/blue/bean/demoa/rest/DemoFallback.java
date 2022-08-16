package com.dou.blue.bean.demoa.rest;

public class DemoFallback implements DemoFeign {

    @Override
    public String circuitbreaker() {
        return "trigger the refuse for service b";
    }
}
