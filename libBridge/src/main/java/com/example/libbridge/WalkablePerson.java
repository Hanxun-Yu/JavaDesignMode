package com.example.libbridge;

public class WalkablePerson extends AbsPerson{
    IWalker iWalker;
    public WalkablePerson(String name, int age, IWalker iWalker) {
        super(name, age);
        this.iWalker = iWalker;
    }

    @Override
    protected void walk() {
        iWalker.doWalk();
    }
}
