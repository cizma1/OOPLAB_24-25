package stu.ibu.edu.Week13.Task2;

public class PaymentFactory {
    public Payment createPayment(String type){
        switch(type){
            case "CreditCard": return new CreditCardPayment();
            case "PayPal": return new PayPalPayment();
            default: throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
