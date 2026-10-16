package main.factory.model.productFactory;

import main.factory.model.product.IBaseProduct;
import main.factory.model.product.ProductA;
import main.factory.model.product.ProductB;

public class ProductAFactory implements IBaseProductFactory {

    //This method can also take a type and place a switch block to create instances.
    //Now, whenever we need to define a new factory, we will create a new
    //IBaseProductFactory which will create that instance.
    @Override
    public IBaseProduct getInstance() {
        return new ProductA();
    }
}
