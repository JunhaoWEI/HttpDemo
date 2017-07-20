package com.example.aa.httpdemo.Retrofit;

import com.example.aa.httpdemo.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by weijunhao on 2017/7/20.
 */

public class RetrofitFactory {
    private static String baseUrl = "http://wthrcdn.etouch.cn/";

    public static RetrofitService service = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(getOkHttpClient())
            .build()
            .create(RetrofitService.class);


    private static OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();


        //添加日志拦截器
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            //设置 Debug Log 模式
            builder.addInterceptor(loggingInterceptor);
        }

        builder.connectTimeout(15, TimeUnit.SECONDS);

        return builder.build();
    }

    //设置OkHttp
    //1.设置网络超时
    //2.设置HttpLoggingInterceptor拦截器
    //3.设置缓存
    //4.设置通用Header
}
