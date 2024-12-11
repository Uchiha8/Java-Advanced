package com.epam.javaadvanced.cleanCode.Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentMethodTest {
    @Test
    public void testCreditCardPayment() {
        PaymentMethod creditCardPayment = new CreditCardPayment();
        assertDoesNotThrow(() -> creditCardPayment.executePayment(100.0));
    }

    @Test
    public void testPayPalPaymentWithLinkedAccount() {
        PaymentMethod payPalPayment = new PayPalPayment(true);
        assertDoesNotThrow(() -> payPalPayment.executePayment(200.0));
    }

    @Test
    public void testPayPalPaymentWithoutLinkedAccount() {
        PaymentMethod payPalPayment = new PayPalPayment(false);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> payPalPayment.executePayment(200.0));
        assertEquals("Invalid payment details.", exception.getMessage());
    }
}
