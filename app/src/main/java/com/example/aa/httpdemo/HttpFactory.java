package com.example.aa.httpdemo;

/**
 * Created by weijunhao on 2017/7/20.
 */

public class HttpFactory {
    private static final HttpFactory ourInstance = new HttpFactory();

    public static HttpFactory getInstance() {
        return ourInstance;
    }

    private HttpFactory() {
    }
}
