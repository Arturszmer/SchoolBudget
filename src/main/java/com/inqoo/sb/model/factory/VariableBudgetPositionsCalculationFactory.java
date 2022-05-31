package com.inqoo.sb.model.factory;

import com.inqoo.sb.model.costs.AdministrationCosts;
import com.inqoo.sb.model.costs.boundary.BudgetPosition;

import java.util.Map;

public enum VariableBudgetPositionsCalculationFactory {
    INSTANCE;
    public VariableBudgetPositionAlgorithm getAlgorithm(BudgetPosition position, Map<String,Object> parameters){
        // TODO: better selection logic, based on config
        if (position instanceof AdministrationCosts){
            return new AdministrationCostsAlgorithm(parameters);
        } else {
            return null;
        }
    }
}
