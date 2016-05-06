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

    private int errorCode;
    private String errorMessage;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
