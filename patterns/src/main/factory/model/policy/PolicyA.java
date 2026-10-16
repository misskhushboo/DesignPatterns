package main.factory.model.policy;

public class PolicyA implements IBasePolicy {
    @Override
    public void doSomething() {
        System.out.println("Implementation of Factory Policy Class A");
    }
}