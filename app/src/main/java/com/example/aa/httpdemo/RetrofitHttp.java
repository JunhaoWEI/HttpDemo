package com.example.aa.httpdemo;

import okhttp3.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aa on 2017/7/20.
 */

public class RetrofitHttp {

    public void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
