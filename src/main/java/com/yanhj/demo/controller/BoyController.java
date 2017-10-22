package com.yanhj.demo.controller;

import com.yanhj.demo.BoyProperties;
import com.yanhj.demo.bean.Boy;
import com.yanhj.demo.dao.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationEvent;
import java.util.List;

/**
 * Created by Administrator on 2017/10/15.
 */
@RestController
@RequestMapping(value = "demo")
public class BoyController {

    @Autowired
    private BoyRepository boyRepository;
    @Autowired
    private BoyProperties boyProperties;

    //配置文件定义参数获取
    @Value("${boy.age}")
    private Integer age;
    @Value("${boy.location}")
    private String location;
    @Value("${boy.content}")
    private String content;


    @GetMapping(value = {"getBoys","findBoys"})
    public List<Boy> findBoys(){
        System.out.println("age="+age);
        System.out.println("location="+location);
        System.out.println("content="+content);
        System.out.println("boyProperties.content="+boyProperties.getContent());
        return boyRepository.findAll();
    }
    @GetMapping(value ="getBoyById")
    public Boy getBoyById(@RequestParam(value="id",required = false,defaultValue = "1") Integer id){
        System.out.println("getBoyById");
        return boyRepository.findOne(id);
    }
}
