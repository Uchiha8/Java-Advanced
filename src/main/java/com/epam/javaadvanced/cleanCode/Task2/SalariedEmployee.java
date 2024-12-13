package com.epam.javaadvanced.cleanCode.Task2;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }


    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    @Override
    public double calculateBonus() {
        return annualSalary * 0.5;
    }
}
