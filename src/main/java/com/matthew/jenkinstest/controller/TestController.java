package com.matthew.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: matthew
 * @Date: 2022/9/12 16:13
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping
    public String test1 () {
        return "test1";
    }
}
