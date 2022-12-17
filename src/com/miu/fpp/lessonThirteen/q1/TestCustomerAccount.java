package com.miu.fpp.lessonThirteen.q1;

public class TestCustomerAccount {
    public static void main(String[] args) {

      CustomerAccount cs = new CustomerAccount("Abbas","50802011",400.34);

        System.out.println(cs.deposit(-5));
        System.out.println(cs.getBalance());
        System.out.println(cs.withdraw(600));
        System.out.println(cs.getBalance());

    }
}
