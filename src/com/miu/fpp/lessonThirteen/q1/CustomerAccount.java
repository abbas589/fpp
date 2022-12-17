package com.miu.fpp.lessonThirteen.q1;

public class CustomerAccount {
    private String customerName;
    private String accountNumber;
    private double balance;

    public CustomerAccount(String name, String accountNumber, double bal) {
        this.customerName = name;
        this.accountNumber = accountNumber;
        this.balance = bal;
    }


    public boolean deposit(double amount) {

        boolean deposited = false;
        try {
            if (amount < 0) {
                throw new UnsupportedOperationException("Negative deposit amount");
            }

            balance = balance + amount;
            deposited = true;

        } catch (UnsupportedOperationException uoe) {
            System.out.println(uoe.getMessage());
        }

        return deposited;

    }

    public boolean withdraw(double amount) {
        boolean withdrawSuccessful = false;
        try {
            if (amount > balance) {
                throw new ExceedsBalanceException("Insufficient funds");
            }
            if (balance - amount < 100) {
                throw new BalanceLowException("Ooops Balance is below $100");

            }
            balance = balance - amount;
            withdrawSuccessful = true;
        } catch (ExceedsBalanceException | BalanceLowException e) {
            System.out.println(e.getMessage());

        }
        return withdrawSuccessful;

    }

    public double getBalance() {
        return balance;
    }

}

class ExceedsBalanceException extends Exception {
    public ExceedsBalanceException(String str) {
        // Calling constructor of parent Exception
        super(str);
    }
}

class BalanceLowException extends Exception {
    public BalanceLowException(String str) {
        // Calling constructor of parent Exception
        super(str);
    }
}

