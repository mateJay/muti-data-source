package com.matej.multidatasource.controller;

import com.matej.multidatasource.service.TestInsert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class test {
    @Resource
    private TestInsert testInsert;

    @GetMapping("/test")
    public String test(@RequestParam("loginMobile") String loginMobile) {
        testInsert.insert(loginMobile);
        return "ok";
    }
}
