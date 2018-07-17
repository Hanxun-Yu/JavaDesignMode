package com.example.libinterceptingfilter;

import java.util.logging.Filter;

public class Test {

    /**
     * 拦截过滤器模式
     * 在执行Target之前，还想添加额外判断，来判断是否可以执行Target
     * 不直接调用Target内的方法，用FilterManager来先执行添加的Filter，再执行Target
     * 一旦Filter执行时返回false，则不可以执行Target,流程终端
     * 在过滤器IFilter中的方法返回true false 来判断是否拦截
     *
     * 与责任链模式相似，
     * 责任链的每层也是类似Filter，从顶层把问题向下抛，一旦有一层处理了，后续则不再处理
     *
     *
     * @param args
     */
    public static void main(String[]args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new DebugFilter());
        filterManager.addFilter(new LoginFilter());
        filterManager.execute(new Request());
    }
}
