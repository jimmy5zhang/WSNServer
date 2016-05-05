package com.hteng.DbOperation;

import com.hteng.entity.User;
import org.springframework.stereotype.Component;

/**
 * 开发者：JimmyZhang
 * 日期：2016/5/5
 * Copyright (C) 2016 华腾科技有限公司
 * 版权所有
 */
@Component
public interface IUserOperation {

    User selectUser(int id);
}
