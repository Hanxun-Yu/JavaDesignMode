package com.example.libbridge;

public class Test {

    /**
     * IWalker为桥接接口
     * 桥接抽象IPerson 与 功能IWalker
     *
     * @param args
     */
    public static void main(String[] args) {
        //用法1，直接选择walk功能
        IPerson peter = new WalkablePerson("Peter", 11, new FastWalker());
        IPerson merry = new WalkablePerson("Merry", 11, new SlowWalker());
    }

    //用法2，内部选择
    static class FastWalkPerson extends AbsPerson {
        IWalker iWalker = new FastWalker();

        public FastWalkPerson(String name, int age) {
            super(name, age);
        }

        @Override
        protected void walk() {
//            iWalker.doWalk();

        }
    }


}
