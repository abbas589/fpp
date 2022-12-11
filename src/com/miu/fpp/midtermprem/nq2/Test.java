package com.miu.fpp.midtermprem.nq2;

public class Test {
    long l1 = 10;
    long l2 = 20;

    public static void compute(int i, int j){
        System.out.println("int version");
    }

    public static void compute(long x, long y){
        System.out.println("long version");
    }

    public static void main(String[] args) {
        Test test = new Test();
//        compute(Test.l1,l2);

        long l = 20l;

        One one = new One(l);

        String ch = "c";
        new One(ch);
    }
}
