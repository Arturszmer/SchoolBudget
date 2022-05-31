package com.inqoo.sb.model.costs;

import com.inqoo.sb.model.costs.boundary.BudgetPosition;

import java.util.List;

public class BudgetPositionInMemoryProvider implements BudgetPositionProvider {

    private List<BudgetPosition> allPositions;

    public void addPosition(BudgetPosition budgetPosition){
        allPositions.add(budgetPosition);
    }
    @Override
    public int getNumberOfTeachersAndStudents() {
        return (int) allPositions.stream().filter(p -> p instanceof TeacherCosts).count();
    }

    @Override
    public int getNumberOfClasses() {
        return 0;
    }
}
