package com.inqoo.sb.model.costs.boundary;

import com.inqoo.sb.model.costs.BudgetPositionType;

import java.time.temporal.ChronoUnit;

public interface BudgetPosition {
    public Double getValue(); // wartość na + lub -
    public ChronoUnit getTimePeriod(); // czas, np. w celu walidacji bądż przeliczenia
    public BudgetPositionType getPositionType(); //
}
