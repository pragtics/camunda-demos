package de.pragtics.demos.variablescopes.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GenerateNumberDelegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int result = new Random().nextInt();
        delegateExecution.setVariableLocal("result", result);
    }
}
