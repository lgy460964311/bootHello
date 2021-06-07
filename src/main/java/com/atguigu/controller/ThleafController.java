package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThleafController {

    @RequestMapping("/test")
    public String thleafHello(Model model){
        model.addAttribute("msg","你好");
        model.addAttribute("test","测试");
        return "theyleaf";
    }
}
