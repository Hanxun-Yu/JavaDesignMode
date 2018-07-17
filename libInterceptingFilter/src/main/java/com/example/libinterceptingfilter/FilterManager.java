package com.example.libinterceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterManager {
    List<IFilter> filters = new ArrayList<>();

    Target target;
    public FilterManager(Target target) {
        this.target = target;
    }

    public void addFilter(IFilter filter) {
        filters.add(filter);
    }

    public void execute(Request request) {
        boolean intercept = false;
        for(int i=0;i<filters.size();i++) {
            if(!filters.get(i).onRequest(request)) {
                intercept = true;
                break;
            }
        }

        if(!intercept) {
            target.execute(request);
        }
    }
}
