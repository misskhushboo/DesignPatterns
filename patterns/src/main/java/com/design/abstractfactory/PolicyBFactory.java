package com.design.abstractfactory;

public class PolicyBFactory implements IBasePolicyFactory {
    @Override
    public IBasePolicy getInstance() {
        return new PolicyB();
    }
}
