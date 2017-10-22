package com.yanhj.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/15.
 */
@RestController
//@Controller
//@ResponseBody
public class HelloController {
    public HelloController() {
        System.out.println("*****************");
    }

    //@RequestMapping(value="/demo",method = RequestMethod.GET)
    @RequestMapping("/demo")
    public String demo() {
        return "this is spring boot demo";
    }

}
