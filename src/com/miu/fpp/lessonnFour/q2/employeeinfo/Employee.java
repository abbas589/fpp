package com.miu.fpp.lessonnFour.q2.employeeinfo;

import com.miu.fpp.lessonnFour.q1.AccountType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    private Account savingsAcct;
    private Account checkingAcct;
    private Account retirementAcct;
    private String name;
    private LocalDate hireDate;

    public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;

/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        hireDate = LocalDate.parse(yearOfHire + "-" + (monthOfHire) + "-" + dayOfHire, formatter);
    }


    public void createNewChecking(double startAmount) {

        checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

    }

    public void createNewSavings(double startAmount) {
        // implement
        savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

    }

    public void createNewRetirement(double startAmount) {
        // implement
        retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

    }

    public String getFormattedAcctInfo() {
        String stringBuilder = "ACCOUNT INFO FOR " + name + " \n\n";

        if(checkingAcct!=null){
             stringBuilder+= checkingAcct.toString();
        }

        if(savingsAcct!=null){
             stringBuilder+= savingsAcct.toString();
        }

        if(retirementAcct!=null){
             stringBuilder+= retirementAcct.toString();
        }


        return stringBuilder;
    }

    public void deposit(String acctType, double amt) {
        // implement
        switch (AccountType.valueOf(acctType)) {
            case CHECKING:
                checkingAcct.makeDeposit(amt);
            case SAVINGS:
                savingsAcct.makeDeposit(amt);
            case RETIREMENT:
                retirementAcct.makeDeposit(amt);
        }
    }

    public boolean withdraw(String acctType, double amt) {
        // implement
        switch (AccountType.valueOf(acctType)) {
            case CHECKING:
                return checkingAcct.makeWithdrawal(amt);
            case SAVINGS:
                return savingsAcct.makeWithdrawal(amt);
            case RETIREMENT:
                return retirementAcct.makeWithdrawal(amt);
            default:
                return false;
        }
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}
