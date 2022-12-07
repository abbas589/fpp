package com.miu.fpp.lessonSix.q4;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double Salary;
    private String designation;
    private final double bonus = 200.0;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double addBonus() {
        return this.Salary + this.bonus;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public void display(){
        System.out.println("==============EMPLOYEE DETAILS==============");
        System.out.println("Name: "+getName());
        System.out.println("Employee ID: "+getEmployeeId());
        System.out.println("Designation: "+getDesignation());
        System.out.println("Department: "+getDepartment());
        System.out.println("Salary: "+getSalary());
        System.out.println("Bonus: "+addBonus());
    }


    @Override
    public boolean equals(Object object) {

        Employee empObj = (Employee) object;

        return designation.equals(empObj.designation);
    }

    public double getBonus() {
        return bonus;
    }
}
