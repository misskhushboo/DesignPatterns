package main.adapter;

public class MainClassImpl {
        public static void main(String[] args) {
            new Application(new AnotherPaymentProcessorAdapter()).makePayment();
        }


}
