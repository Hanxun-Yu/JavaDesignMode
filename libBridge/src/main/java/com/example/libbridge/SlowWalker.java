package com.example.libbridge;

public class SlowWalker implements IWalker {
    @Override
    public void doWalk() {
        System.out.println("walk slowly");
    }
}
