package com.example.libinterceptingfilter;

public interface IFilter {
    boolean onRequest(Request request);
}
