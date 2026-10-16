package main.factory.model.policyFactory;

import main.factory.model.policy.IBasePolicy;
import main.factory.model.policy.PolicyA;

public class PolicyAFactory implements IBasePolicyFactory {
    @Override
    public IBasePolicy getInstance() {
        return new PolicyA();
    }
}