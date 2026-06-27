package com.design.factorymethod;

public class NewProductFactory {

    public static void main(String[] args) {
        new NewProductFactory().sendNotification(new ProductAFactory());
    }

    void sendNotification(IBaseProductFactory factory){
        factory.getInstance().doSomething();
        //Implementation of Factory Class A
    }
}
