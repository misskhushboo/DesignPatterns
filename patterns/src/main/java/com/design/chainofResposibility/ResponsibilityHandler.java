package com.design.chainofResposibility;

public class ResponsibilityHandler {
}


record customLog(String message, LogLevels level){}


abstract class Handler{
    abstract boolean canHandle(customLog log);
    abstract void handle(customLog log);

    //Every child class will have Handler so keeping it in superclass
    //But subclass needs to pass on to the super class;
    private Handler nextHandler;

    public Handler(Handler handler){
        this.nextHandler=handler;
    }

    public void call_next_handler(customLog log){
         nextHandler.handle(log);
    }
}
//Child classes can check if they can handle.
// If they can handle, all good.
// If not then they can pass to another handler.
//This is creating the pipeline.
class Level1 extends  Handler{

    public Level1(Handler nextHandler){
        super(nextHandler);
    }
    boolean canHandle(customLog log){
        //check condition to check whether you can handle the current request


        System.out.println("");
        return false;
    }
    void handle(customLog log){
        if(log.level().getLevels()<=LogLevels.INFO)
            System.out.println("Request is handled by Level1");
        else
            call_next_handler(log);
    }
}

class Level2 extends  Handler{

    public Level2(Handler nextHandler){
        super(nextHandler);
    }
    boolean canHandle(customLog log){
        System.out.println("");
        return true;
    }
    void handle(customLog log){
        if(canHandle(log))
            System.out.println("Request is handled by Level1");
        else
            call_next_handler(log);
    }
}