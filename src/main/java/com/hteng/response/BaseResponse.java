package com.hteng.response;

import java.io.Serializable;
import java.util.List;

/**
 * 开发者：JimmyZhang 响应体基类
 * 日期：2016/4/3
 * Copyright (C) 2016 华腾科技有限公司
 * 版权所有
 */
public class BaseResponse implements Serializable {

    private int responseCode;
    private String responseMessage;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
