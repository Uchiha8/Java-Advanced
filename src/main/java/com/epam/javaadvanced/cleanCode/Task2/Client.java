package com.epam.javaadvanced.cleanCode.Task2;

public class Client {
    public void processEmployee(Employee employee) {
        System.out.println("Processing " + employee.getName());
        System.out.println("Pay: " + employee.calculatePay());
        System.out.println("Bonus: " + employee.calculateBonus());
    }

    public static void main(String[] args) {
        Employee hourly = new HourlyEmployee("Mukhammad", 45, 20);
        Employee salaried = new SalariedEmployee("Asad", 125000);
        Employee commissioned = new HourlyEmployee("Alisher", 4500, 20);

        Client client = new Client();
        client.processEmployee(hourly);
        client.processEmployee(salaried);
        client.processEmployee(commissioned);
    }
}
