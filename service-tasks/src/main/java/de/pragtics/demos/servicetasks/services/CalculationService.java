package de.pragtics.demos.servicetasks.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CalculationService {

    private static Logger log = LoggerFactory.getLogger(CalculationService.class);

    public void doCalculation() {
        log.info("Calculation service is executing calculation.");
    }
}
