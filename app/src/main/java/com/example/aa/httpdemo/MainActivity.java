package com.example.aa.httpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.aa.httpdemo.Retrofit.*;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Call call = com.example.aa.httpdemo.Retrofit.RetrofitFactory.service
                .getTest("上海");
        call.enqueue(new HttpCallback<User>() {
                    @Override
                    protected void onFailure(String message) {
                        mTextView.setText(message == null ? "null" : message);
                    }

                    @Override
                    protected void onSucess(Response<BaseCallModel<User>> response) {
                        Log.d("wjh", "onSucess: " + response.body().getData().getCity());
                        mTextView.setText(response.body().getData().toString());
                    }
                });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
