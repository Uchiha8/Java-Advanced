package com.epam.javaadvanced.cleanCode.Task3;

public class PayPalPayment extends PaymentMethod {

    private boolean linkedToBankAccount;

    public PayPalPayment(boolean linkedToBankAccount) {
        this.linkedToBankAccount = linkedToBankAccount;
    }

    @Override
    boolean validatePaymentDetails() {
        return linkedToBankAccount;
    }

    @Override
    void processpayment(double amount) throws IllegalArgumentException {
        if (!linkedToBankAccount) {
            throw new IllegalArgumentException("PayPal account is not linked to a bank account.");
        }
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
