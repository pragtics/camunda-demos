package processvariables.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class UseCalculationDelegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Integer result = (Integer)delegateExecution.getVariable("calculationResult");
        System.out.println("Result: " + result);
    }
}
