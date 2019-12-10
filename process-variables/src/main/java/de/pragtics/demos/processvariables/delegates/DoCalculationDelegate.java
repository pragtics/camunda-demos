package de.pragtics.demos.processvariables.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class DoCalculationDelegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int result = 1 + 1;
        delegateExecution.setVariable("calculationResult", result);
    }
}
