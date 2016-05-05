package com.hteng.controller;

import com.alibaba.fastjson.JSON;
import com.hteng.DbOperation.IUserOperation;
import com.hteng.dao.UserDao;
import com.hteng.entity.User;
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
@Controller
@RequestMapping("/test")
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


}