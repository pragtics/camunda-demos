package de.pragtics.demos.variablescopes.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PrintNumberDelegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Integer result = (Integer)delegateExecution.getVariableLocal("result");
        System.out.println("Result: " + result);
    }
}
