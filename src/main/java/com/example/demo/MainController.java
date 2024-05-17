package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "test";
    }


    @RequestMapping("/test")
    public String test() {
        return "test2";
    }

    @ResponseBody
    @RequestMapping("/error1")
    public String error() {
        return "error1234";
    }
}
