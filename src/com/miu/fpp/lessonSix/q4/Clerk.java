package com.miu.fpp.lessonSix.q4;

public class Clerk extends Employee {


    private final double clerkBonus = 100.0;

    @Override
    public double addBonus() {
        return super.getSalary() + clerkBonus + this.getBonus();
    }
}
