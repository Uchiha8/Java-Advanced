package com.epam.javaadvanced.cleanCode.Task2;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateBonus() {
        return hoursWorked > 40 ? (hoursWorked - 40) * hourlyRate * 0.5 : 0;
    }
}
