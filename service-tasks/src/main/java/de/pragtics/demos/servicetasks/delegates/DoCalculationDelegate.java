package de.pragtics.demos.servicetasks.delegates;

import de.pragtics.demos.servicetasks.services.CalculationService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class DoCalculationDelegate implements JavaDelegate {

    private CalculationService calculationService;

    public DoCalculationDelegate(CalculationService calculationService) {

        this.calculationService = calculationService;
    }

    public void execute(DelegateExecution delegateExecution) throws Exception {
        this.calculationService.doCalculation();
    }
}
