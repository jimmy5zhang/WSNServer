package com.hteng.controller;

import com.alibaba.fastjson.JSON;
import com.hteng.DbOperation.IUserOperation;
import com.hteng.entity.User;
import com.hteng.response.LoginResponse;
import com.hteng.response.StatusCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 开发者：JimmyZhang
 * 日期：2016/4/3
 * Copyright (C) 2016 华腾科技有限公司
 * 版权所有
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserOperation userDao;

    @RequestMapping(value = "/999", method = GET)
    public String getByEmail11() {

        return "ddd";
    }

    @RequestMapping(value = "/get-by-email/{id}", method = GET)
    public String getByEmail(@PathVariable int id) {
        User user = null;
        try{
            user = userDao.selectUser(id);
        }catch (Exception ex){
            ex.printStackTrace();
        }

       return JSON.toJSONString(user);
    }

    @RequestMapping(value = "/login/{name}/{password}", method = GET)
    public String login(@PathVariable String name,@PathVariable String password) {
        User user = null;
        LoginResponse loginResponse = new LoginResponse();
        try{
            user = userDao.loginUser(name,password);
            if(null != user){
                loginResponse.setObject(user);
                loginResponse.setResponseCode(StatusCodes.SUCCESS);
                loginResponse.setResponseMessage("恭喜你,登录成功!");
            }else {
                loginResponse.setResponseCode(StatusCodes.NOT_FOUND);
                loginResponse.setResponseMessage("用户名或者密码错误!");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return JSON.toJSONString(loginResponse);
    }

}