package com.example.aa.httpdemo;

/**
 * Created by weijunhao on 2017/7/20.
 */

public class BaseCallModel<T> {
    private int status;
    private String desc;
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
