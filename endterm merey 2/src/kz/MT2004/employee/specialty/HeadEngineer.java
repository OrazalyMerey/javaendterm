package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.TechnicalManagement;

public class HeadEngineer extends Employee implements TechnicalManagement {

    public HeadEngineer(int employee_id) {
        this.setEmployee_id(employee_id);
        this.setSpecialty("HeadEngineer");
    }
    public HeadEngineer() {

    }
    @Override
    public String TechWork() {
        return "In Technical department I work as HeadEngineer and i like my job in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The head engineer is responsible for the technical condition of the television equipment.";
    }
}


