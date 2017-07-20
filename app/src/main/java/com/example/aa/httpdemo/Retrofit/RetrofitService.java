package com.example.aa.httpdemo.Retrofit;

import com.example.aa.httpdemo.BaseCallModel;
import com.example.aa.httpdemo.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by weijunhao on 2017/7/20.
 */

public interface RetrofitService {

    @GET("weather_mini")
    Call<BaseCallModel<User>> getTest(@Query("city") String city);
}
