package com.example.libinterceptingfilter;

import java.util.logging.Filter;

public class DebugFilter implements IFilter{
    @Override
    public boolean onRequest(Request request) {
        System.out.println("log");
        return true;
    }
}
