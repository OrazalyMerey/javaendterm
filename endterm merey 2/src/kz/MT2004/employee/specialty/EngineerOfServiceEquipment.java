package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.TechnicalManagement;

public class EngineerOfServiceEquipment extends Employee implements TechnicalManagement {
    @Override
    public String TechWork() {
        return "In Technical department I work as Engineer of Service Equipment and i like my position in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "Engineer of service equipment responsible for service instructions in case of equipment breakdown.";
    }
}
