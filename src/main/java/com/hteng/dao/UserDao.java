package com.hteng.dao;

import com.hteng.entity.User;

/**
 * 开发者：JimmyZhang
 * 日期：2016/4/3
 * Copyright (C) 2016 华腾科技有限公司
 * 版权所有
 */

public interface UserDao{
    public User findByEmail(String email);
}
