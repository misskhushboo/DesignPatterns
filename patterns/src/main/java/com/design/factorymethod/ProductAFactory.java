package com.design.factorymethod;

import com.design.factory.IBaseProduct;
import com.design.factory.ProductA;

public class ProductAFactory implements IBaseProductFactory {
    @Override
    public IBaseProduct getInstance() {
        return new ProductA();
    }
}
