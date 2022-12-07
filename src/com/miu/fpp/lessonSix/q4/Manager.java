package com.miu.fpp.lessonSix.q4;

public class Manager extends Employee{
    private final double mgrBonus = 200.0;

    @Override
    public double addBonus() {
        return super.getSalary() + mgrBonus + super.getBonus();
    }
}
