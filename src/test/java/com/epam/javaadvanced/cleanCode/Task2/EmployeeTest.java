package com.epam.javaadvanced.cleanCode.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void testHourlyEmployeePayAndBonus() {
        Employee hourly = new HourlyEmployee("Mirjalol", 40, 15);
        assertEquals(600, hourly.calculatePay());
        assertEquals(0, hourly.calculateBonus());
    }

    @Test
    public void testSalariedEmployeePayAndBonus() {
        Employee salaried = new SalariedEmployee("Alisher", 6000);
        assertEquals(500, salaried.calculatePay());
    }

    @Test
    public void testCommissionedEmployeeBonus() {
        Employee commissioned = new CommissionedEmployee("Max", 5000.0, 0.2);
        assertEquals(1000, commissioned.calculatePay());
        assertEquals(100, commissioned.calculateBonus());
    }
}
