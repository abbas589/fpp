package com.miu.fpp.midtermprem.nq1;

public class Test {
    private int i =0;

    class TestInner {
        public int i = 1;
        void sayHi(){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        Test inner = new Test().new TestInner();
    }
}
