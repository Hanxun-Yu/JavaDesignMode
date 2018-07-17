package com.example.libinterceptingfilter;

public class LoginFilter implements IFilter{
    @Override
    public boolean onRequest(Request request) {
        boolean isLogin = true;

        return isLogin;
    }
}
