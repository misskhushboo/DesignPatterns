package com.design.abstractfactory;

import com.design.factory.IBaseProduct;
import com.design.factorymethod.IBaseProductFactory;

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
