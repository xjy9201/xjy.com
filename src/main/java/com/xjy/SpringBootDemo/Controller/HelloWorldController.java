package com.xjy.SpringBootDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("hello")
    public String helloWorld(){
        System.out.println("Test GitHub Push!");
        return "hello spring version 2.0这是版本2.0";
    }
}
//com.xjy.SpringBootDemo.Controller; 需要把这个包放到扫描器里，@AutoConfigurationPackage起的作用