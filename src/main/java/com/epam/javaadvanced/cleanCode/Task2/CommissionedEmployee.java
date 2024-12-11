package com.epam.javaadvanced.cleanCode.Task2;

public class CommissionedEmployee extends Employee {

    private double salesAmount;
    private double commissionRate;

    public CommissionedEmployee(String name, double salesAmount, double commissionRate) {
        super(name);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return salesAmount * commissionRate;
    }

    @Override
    public double calculateBonus() {
        return calculatePay() * 0.1;
    }
}
