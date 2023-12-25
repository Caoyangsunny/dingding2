package com.kaifamiao.dingding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/test")
    public String hello(){
        return "hello";
    }
}
