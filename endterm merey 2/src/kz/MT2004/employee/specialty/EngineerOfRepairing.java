package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.TechnicalManagement;

public class EngineerOfRepairing extends Employee implements TechnicalManagement {
    @Override
    public String TechWork() {
        return "In Technical department I work as Engineer Of Repairing and i like my job in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The engineer of repairing is responsible for repairing equipment";
    }
}