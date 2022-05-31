package com.inqoo.sb.model.costs;

import com.inqoo.sb.model.costs.boundary.BudgetPosition;

import java.time.temporal.ChronoUnit;

/**
 * klasa przykładowego nauczyciela
 * nauczyciel zabiera po 6000 miesięcznie - stale
 */


public class TeacherCosts implements BudgetPosition {

    public Double getValue() {
        return -6000d;
    }

    public ChronoUnit getTimePeriod() {
        return ChronoUnit.MONTHS;
    }

    public BudgetPositionType getPositionType() {
        return BudgetPositionType.CONSTANT;
    }

}
