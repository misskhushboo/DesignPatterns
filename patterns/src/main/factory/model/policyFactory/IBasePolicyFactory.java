package main.factory.model.policyFactory;

import main.factory.model.policy.IBasePolicy;
import main.factory.model.policy.PolicyA;

public interface IBasePolicyFactory {

    public IBasePolicy getInstance();
}

