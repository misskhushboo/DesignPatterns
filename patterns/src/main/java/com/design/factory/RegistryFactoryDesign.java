package com.design.factory;

import java.util.HashMap;
import java.util.Map;

public class RegistryFactoryDesign {

    private static final Map<String, IBaseProduct> registry=new HashMap<>();

    //Products registered once
    static{
        // Initialize registry once at startup
        registry.putIfAbsent("A", new ProductA());
        registry.putIfAbsent("B", new ProductB());
    }

    /**
    * Registry based factory method
    */
    public static IBaseProduct create(String message){

    IBaseProduct product=registry.get(message);
        if(product==null)
         throw new IllegalArgumentException("Unknown type:"+message);
     return product;
    }

    public static void main(String[] args) {
        create("A").doSomething();
    }
}
