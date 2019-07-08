package com.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("toIndex")
    public String toIndex(){

        return "common/index";
    }
}
