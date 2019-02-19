package com.example.ecomm.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ecomm.R;
import com.example.ecomm.contracts.LoginActivityContract;
import com.example.ecomm.presenters.LoginActivityPresenter;

public class LoginActivity extends AppCompatActivity implements LoginActivityContract.View, View.OnClickListener {

    TextView label;
    Button submit;

    LoginActivityContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mPresenter = new LoginActivityPresenter(this);

    }


    @Override
    public void initView() {
        label = findViewById(R.id.label);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(this);
    }

    @Override
    public void setViewData(String data) {
        label.setText(data);
    }

    @Override
    public void onClick(View v) {
        mPresenter.onClick(v);
    }
}
