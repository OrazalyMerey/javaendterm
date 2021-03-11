package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.TechnicalManagement;

public class SystemEngineer extends Employee implements TechnicalManagement {
    @Override
    public String TechWork() {
        return "In Technical department I work as System Engineer and i like my job in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The system engineer is responsible for the functionality of the programmes.";
    }
}
