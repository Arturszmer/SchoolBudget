package com.inqoo.sb.model.factory;

import com.inqoo.sb.model.costs.AdministrationCosts;
import com.inqoo.sb.model.costs.TeacherCosts;

import java.util.Map;

public class AdministrationCostsAlgorithmV2 implements VariableBudgetPositionAlgorithm {
    private final Map<String, Object> parameters;

    public AdministrationCostsAlgorithmV2(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public double getValue() {
        TeacherCosts administrationSalary = new TeacherCosts();
        AdministrationCosts noOfTeachersAndStudents = null;
        noOfTeachersAndStudents.getValue();

        // TODO: based on parameters and information from analytic create calculation
        double adminSalary = administrationSalary.getValue() * 0.70d * (-1d);
        return adminSalary;
    }
}
