package ru.mirea.task26;

interface PaymentStrategy{
    void askData();
}

class creditCardStrategy implements PaymentStrategy{
    @Override
    public void askData() {
        System.out.println("Credit card strategy");
    }
}

class eWallletStrategy implements PaymentStrategy{
    @Override
    public void askData() {
        System.out.println("Ewallet strategy");
    }
}

class PaymentMethod {
    PaymentStrategy paymentStrategy;
    public PaymentMethod(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    void askData(){
        paymentStrategy.askData();
    }
}

class eWallet extends PaymentMethod {

    public eWallet() {
        super(new eWallletStrategy());
    }
}

class creditCard extends PaymentMethod {

    public creditCard() {
        super(new creditCardStrategy());
    }
}

public class Strategy {
    public static void main(String[] args) {
        PaymentMethod newpm = new creditCard();
        newpm.askData();

        newpm = new eWallet();
        newpm.askData();
    }
}