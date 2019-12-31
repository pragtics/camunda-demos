package de.pragtics.demos.parallelgateway.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class Task1Delegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Executing Task1");
    }
}
