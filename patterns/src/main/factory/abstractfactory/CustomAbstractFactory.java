package main.factory.abstractfactory;

import main.factory.model.policyFactory.IBasePolicyFactory;
import main.factory.model.productFactory.IBaseProductFactory;

/**
 * When the factory creates more than one Factory then it's an AbsractFactory
 * otherwise it's only a Factory method design
 */
public interface CustomAbstractFactory {

    IBaseProductFactory getProduct();
    IBasePolicyFactory getPolicy();
}

class CustomAbstractFactoryImpl implements CustomAbstractFactory{

    public IBaseProductFactory getProduct(){
        return null;//new IBaseProductFactory();
    }

    public IBasePolicyFactory getPolicy(){
        return null;
    }
}
