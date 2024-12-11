package com.epam.javaadvanced.cleanCode.Task3;

public class PaymentProcessor {
    public void makePayment(PaymentMethod payment, double amount) {
        try {
            payment.executePayment(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod PayPalPayment = new PayPalPayment(true);
        PaymentMethod unlinkedPayPalPayment = new PayPalPayment(false);

        PaymentProcessor processor = new PaymentProcessor();
        processor.makePayment(creditCardPayment, 100.0);
        processor.makePayment(PayPalPayment, 200.0);
        processor.makePayment(unlinkedPayPalPayment, 300.0);
    }
}
