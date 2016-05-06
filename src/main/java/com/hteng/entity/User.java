package com.hteng.entity;


import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 开发者：JimmyZhang
 * 日期：2016/4/3
 * Copyright (C) 2016 华腾科技有限公司
 * 版权所有
 */
public class User implements Serializable {

    private long id;
    private String email;
    private String name;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
