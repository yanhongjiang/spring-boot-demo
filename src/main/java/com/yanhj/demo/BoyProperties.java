package com.yanhj.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/15.
 */
@Component
@ConfigurationProperties(prefix = "boy")
public class BoyProperties {
    private Integer age;
    private String location;
    private String content;

    public Integer getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getContent() {
        return content;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
