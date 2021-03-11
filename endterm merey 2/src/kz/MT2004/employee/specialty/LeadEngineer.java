package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.TechnicalManagement;

public class LeadEngineer extends Employee implements TechnicalManagement {
    @Override
    public String TechWork() {
        return "In Technical department I work as LeadEngineer and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "Lead engineer deputy head engineer.";
    }
}
