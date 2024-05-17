package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @ResponseBody
    @RequestMapping("/")
    public String index() {
        return "찬수형 얼른 CICD 해 화면이 없는 REST API 서버입니다. 여기는 HTML 없어요";
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
