package main.factory.model.policyFactory;

import main.factory.model.policy.IBasePolicy;
import main.factory.model.policy.PolicyB;

public class PolicyBFactory implements IBasePolicyFactory {
    @Override
    public IBasePolicy getInstance() {
        return new PolicyB();
    }
}