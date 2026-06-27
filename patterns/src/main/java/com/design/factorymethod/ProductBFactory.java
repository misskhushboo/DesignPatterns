package com.design.factorymethod;

import com.design.factory.IBaseProduct;
import com.design.factory.ProductA;
import com.design.factory.ProductB;

public class ProductBFactory implements IBaseProductFactory {
    @Override
    public IBaseProduct getInstance() {
        return new ProductB();
    }
}
