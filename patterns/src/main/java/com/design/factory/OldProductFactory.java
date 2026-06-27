package com.design.factory;

public class OldProductFactory {
    public static void main(String[] args) {

        IBaseProduct factoryObj=OldProductFactory.create("B");
        factoryObj.doSomething();
    }

    /**
     * This acts like a factory design pattern but violates the principle of open-closed principle.
     * Adding a new product requires modifying the factory's initialize() method
     * @param message
     * @return
     */
    public static IBaseProduct create(String message){
        switch(message){
            case "A": return new ProductA();
            case "B" : return new ProductB();
            default: throw new IllegalArgumentException("No implementation exists");

        }
    }
}
