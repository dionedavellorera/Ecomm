package com.example.ecomm.presenters;

import android.view.View;

import com.example.ecomm.contracts.LoginActivityContract;
import com.example.ecomm.models.LoginActivityModel;

public class LoginActivityPresenter implements LoginActivityContract.Presenter {

    LoginActivityContract.View mView;
    LoginActivityContract.Model mModel;

    public LoginActivityPresenter(LoginActivityContract.View view) {
        mView = view;

        initPresenter();
    }

    private void initPresenter() {
        mModel = new LoginActivityModel();

        mView.initView();
    }

    @Override
    public void onClick(View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}
