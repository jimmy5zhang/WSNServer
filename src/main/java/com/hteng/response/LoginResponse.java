package com.hteng.response;

import com.hteng.entity.User;

/**
 * Created by JimmyZhang on 2016/5/6.
 */
public class LoginResponse extends BaseResponse {

    private User object;

    public User getObject() {
        return object;
    }

    public void setObject(User object) {
        this.object = object;
    }
}
