package com.miu.fpp.midtermprem.q8;

public class Test {
    private int i = 1;
    int j = 2;

    public void TestMethod() {
        class TestInner {

            int k = 3;
            final int l = 4;
            public void InerMethood(int m){
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
                System.out.println(l);
                System.out.println(m);
            }
        }
    }
}
