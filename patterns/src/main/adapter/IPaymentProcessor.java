package main.adapter;

public interface IPaymentProcessor {
    void pay();
}

class InHousePaymentProcessor implements IPaymentProcessor{
    public void pay(){
        System.out.println("InhousePaymentProcessor is processing the payment.");
    }
}

class Application{
    IPaymentProcessor inIPaymentProcessor;

    Application(IPaymentProcessor iPaymentProcessor){
        this.inIPaymentProcessor= inIPaymentProcessor;
    }

    public void makePayment(){
        inIPaymentProcessor.pay();
    }
}
/*class MainClass {
    public static void main(String[] args) {
        new Application(new InHousePaymentProcessor()).makePayment();
    }

}*/
//--------------------------------------------
// Now lets says we have another payment method which we want to integrate but
//since this class is not implementing the interface I cannot create an instance
// of this class in MainClass so I will create an adapter
class AnotherPaymentProcessor {
    public void payAnything(){
        System.out.println("AnotherPaymentProcessor is processing the payment.");
    }
}

class AnotherPaymentProcessorAdapter implements IPaymentProcessor{
    AnotherPaymentProcessor anotherPaymentProcessor;

    AnotherPaymentProcessorAdapter(){
        this.anotherPaymentProcessor=new AnotherPaymentProcessor();
    }
    public void pay(){
        anotherPaymentProcessor.payAnything();
        System.out.println("AnotherPaymentProcessorAdapter is processing the payment.");
    }
}

