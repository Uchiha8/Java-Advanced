package com.epam.javaadvanced.cleanCode.Task3;

public class CreditCardPayment extends PaymentMethod {

    @Override
    boolean validatePaymentDetails() {
        return true;
    }

    @Override
    void processpayment(double amount) throws IllegalArgumentException {
        System.out.println("Credit Card Payment is verified");
    }
}
