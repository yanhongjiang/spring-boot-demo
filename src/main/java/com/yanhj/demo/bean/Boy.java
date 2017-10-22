package com.yanhj.demo.bean;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


/**
 * Created by Administrator on 2017/10/15.
 */
@Entity
public class Boy {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String height;

    public Boy() {
    }

    public Integer getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
