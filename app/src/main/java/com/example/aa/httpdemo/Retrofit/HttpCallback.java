package com.example.aa.httpdemo.Retrofit;

import android.util.Log;

import com.example.aa.httpdemo.BaseCallModel;

import java.net.SocketTimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by weijunhao on 2017/7/20.
 */

public abstract class HttpCallback<T> implements Callback<BaseCallModel<T>> {

    @Override
    public void onResponse(Call<BaseCallModel<T>> call, Response<BaseCallModel<T>> response) {
        Log.d("wjh", "onResponse: " + response.toString());
        if (response.raw().code() == 200) {
            onSucess(response);
        } else {
            onFailure(call, new RuntimeException("response error, detail =" + response.raw().toString()));
        }
    }

    @Override
    public void onFailure(Call<BaseCallModel<T>> call, Throwable t) {
        Log.d("wjh", "onFailure: " + t.toString());
        onFailure(t.getMessage());
    }

    protected abstract void onFailure(String message);

    protected abstract void onSucess(Response<BaseCallModel<T>> response);


}
