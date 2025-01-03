package stu.ibu.edu.Week13.Task2;

public class MainPayment {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        Payment payment1 = factory.createPayment("CreditCard");
        payment1.processPayment();

        Payment payment2 = factory.createPayment("PayPal");
        payment2.processPayment();
    }
}
