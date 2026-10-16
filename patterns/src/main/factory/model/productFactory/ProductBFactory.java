package main.factory.model.productFactory;

import main.factory.model.product.IBaseProduct;
import main.factory.model.product.ProductB;

public
class ProductBFactory implements IBaseProductFactory {
    @Override
    public IBaseProduct getInstance() {
        return new ProductB();
    }
}