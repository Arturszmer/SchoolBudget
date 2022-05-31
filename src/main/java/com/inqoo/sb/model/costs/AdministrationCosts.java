package com.inqoo.sb.model.costs;

import com.inqoo.sb.model.costs.boundary.BudgetPosition;

import java.time.temporal.ChronoUnit;
import java.util.Map;

import static com.inqoo.sb.model.factory.VariableBudgetPositionsCalculationFactory.INSTANCE;

/**
 * odpowiada na pytanie kiedy będzie jedna z wielu badget positions
 * od czego zależą koszty administracji
 * budget position provider - źródło, dostawca informacji o wszystkich pozycjach budżetu
 * Wzorzec singletone
 */

public class AdministrationCosts implements BudgetPosition {

    private BudgetPositionProvider budgetPositionProvider; // dostawca informacji o wszystkich pozycjach budżetu

    public AdministrationCosts(BudgetPositionProvider budgetPositionProvider) {
        this.budgetPositionProvider = budgetPositionProvider;
    }


    public Double getValue() {
        var algorithm
                = INSTANCE.getAlgorithm(this, Map.of("noOfTeachersAndStudents", budgetPositionProvider.getNumberOfTeachersAndStudents()));
        return algorithm.getValue();
    }

    public ChronoUnit getTimePeriod() {
        return ChronoUnit.MONTHS;
    }

    public BudgetPositionType getPositionType() {
        return BudgetPositionType.VARIABLE;
    }
}
