package com.shk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class TestController  {

    @RequestMapping("test")
    public String  test(){
        return "index";
    }
}