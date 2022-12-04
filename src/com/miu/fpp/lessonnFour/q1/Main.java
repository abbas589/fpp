package com.miu.fpp.lessonnFour.q1;

public class Main {
    public static void main(String[] args) {

        Employee edet = new Employee("Edet My Guy","E moneyyy",45000.43,1999,12,29);

        Account checkingAcc = new Account(edet, AccountType.CHECKING, 300.00);
        Account savingsAcc = new Account(edet, AccountType.SAVINGS, 300.00);
        Account retirementAcc = new Account(edet, AccountType.RETIREMENT, 300.00);


        System.out.println(checkingAcc.toString());
        System.out.println(savingsAcc.toString());
        System.out.println(retirementAcc.toString());


    }
}
