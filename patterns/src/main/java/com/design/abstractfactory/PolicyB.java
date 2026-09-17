package com.design.abstractfactory;

import com.design.factory.IBaseProduct;

public class PolicyB implements IBasePolicy {
    @Override
    public void doSomething() {
        System.out.println("Implementation of Factory Policy Class B");
    }
}
