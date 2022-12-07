package com.miu.fpp.lessonSix.q4;

public class Main {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        clerk.setName("Jason");
        clerk.setDepartment("CS");
        clerk.setDesignation("MGR");
        clerk.setEmployeeId(1);
        clerk.setSalary(400);
        clerk.addBonus();

        Manager manager = new Manager();
        manager.setName("Edet");
        manager.setDepartment("CS");
        manager.setDesignation("SFT");
        manager.setEmployeeId(2);
        manager.setSalary(300.0);
        manager.addBonus();


        clerk.display();
        manager.display();
    }
}
