package com.example.teacherma.scrollviewdemo.model;

import com.example.teacherma.scrollviewdemo.utils.BaseUtil;
import com.example.teacherma.scrollviewdemo.utils.Constants;

public class BaseResponse<T> {

    private int mCode;
    private String mDesc;
    private T mBody;

    public int getCode() {
        return mCode;
    }

    public void setCode(int code) {
        mCode = code;
    }

    public String getDesc() {
        return BaseUtil.checkNotNull(mDesc);
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }

    public T getBody() {
        return mBody;
    }

    public void setBody(T body) {
        mBody = body;
    }


    public boolean isSuccess() {
        return mCode == Constants.ResponseCode.SUCCESS;
    }


}
