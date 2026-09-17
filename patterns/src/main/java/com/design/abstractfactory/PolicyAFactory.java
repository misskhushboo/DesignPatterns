package com.design.abstractfactory;

import com.design.factory.IBaseProduct;
import com.design.factory.ProductA;
import com.design.factorymethod.IBaseProductFactory;

public class PolicyAFactory implements IBasePolicyFactory {
    @Override
    public IBasePolicy getInstance() {
        return new PolicyA();
    }
}
