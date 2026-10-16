package main.factory.factorymethod;


import main.factory.model.product.IBaseProduct;
import main.factory.model.productFactory.IBaseProductFactory;
import main.factory.model.productFactory.ProductAFactory;

public class NewProductFactory {

    public static void main(String[] args) {
        NewProductFactory pf=new NewProductFactory();
        IBaseProductFactory factory=new ProductAFactory();
        pf.sendNotification(factory);
    }

    /**
     * Defines an interface for creating objects but allows subclassess
     * to decide which class to instantiate.
     * @param factory
     */
    void sendNotification(IBaseProductFactory factory){
        IBaseProduct basepproduct=factory.getInstance();
        basepproduct.doSomething();             //Implementation of Factory Class A
    }
}
