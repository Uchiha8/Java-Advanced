package com.epam.javaadvanced.cleanCode.Task3;

abstract class PaymentMethod {
    abstract boolean validatePaymentDetails();
    abstract void processpayment(double amount) throws IllegalArgumentException;

    public final void executePayment(double amount) {
        if (!validatePaymentDetails()) {
            throw new IllegalArgumentException("Invalid payment details.");
        }
        processpayment(amount);
    }
}
