package com.example.ecomm.models;

import com.example.ecomm.contracts.LoginActivityContract;

public class LoginActivityModel implements LoginActivityContract.Model {

    @Override
    public String getData() {
        return "This is my string";
    }

}
