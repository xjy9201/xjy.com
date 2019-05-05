package com.xjy.SpringBootDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("hello")
    public String helloWorld(){
        return "hello spring version 1.0这是版本1.0";
    }
}
//com.xjy.SpringBootDemo.Controller; 需要把这个包放到扫描器里，@AutoConfigurationPackage起的作用