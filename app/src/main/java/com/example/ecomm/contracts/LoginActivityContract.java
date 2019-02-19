package com.example.ecomm.contracts;

import android.view.View;

public interface LoginActivityContract {

    interface View {
        void initView();
        void setViewData(String data);
    }

    interface Model {
        String getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }
}
