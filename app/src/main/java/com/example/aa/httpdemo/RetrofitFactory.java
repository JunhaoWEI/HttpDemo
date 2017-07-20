package com.example.aa.httpdemo;

import com.example.aa.httpdemo.Retrofit.RetrofitService;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by weijunhao on 2017/7/20.
 */

public class RetrofitFactory {
    private static String baseUrl = "http://wthrcdn.etouch.cn/weather_mini";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static RetrofitService getService() {
        RetrofitService service = retrofit.create(RetrofitService.class);
        return service;
    }

    //设置OkHttp
    //1.设置网络超时
    //2.设置HttpLoggingInterceptor拦截器
    //3.设置缓存
    //4.设置通用Header




    //4.添加统一的请求头Header
    public void addHead() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder()
                        .addHeader("x-from", "")
                        .addHeader("x-brand", "")
                        .addHeader("x-imei", "")
                        .build();
                return chain.proceed(newRequest);
            }
        });
    }


}
