package com.miu.fpp.lessonnFour.q1;

public class Account {

    private final static double DEFAULT_BALANCE = 0.0;
    private double balance;
    private AccountType acctType;
    private Employee employee;

    public Account(Employee emp, AccountType acctType, double balance) {
        employee = emp;
        this.acctType = acctType;
        this.balance = balance;
    }

    Account(Employee emp, AccountType acctType) {
        this(emp, acctType, DEFAULT_BALANCE);
    }

    public String toString() {
        return "type = " + acctType + ", balance = " + balance;
    }

    public void makeDeposit(double deposit) {
        // implement
        balance += deposit;
    }

    public boolean makeWithdrawal(double amount) {
        // implement
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public AccountType getAcctType() {
        return acctType;
    }

    public double getBalance() {
        return balance;
    }
}
