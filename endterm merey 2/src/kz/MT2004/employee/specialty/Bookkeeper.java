package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Administration;

public class Bookkeeper extends Employee implements Administration {

    public Bookkeeper(int employee_id) {
        this.setEmployee_id(employee_id);
        this.setSpecialty("Bookkeeper");
    }

    public Bookkeeper() {
    }

    @Override
    public String AdminWork() {
        return "In Administration department I work as Bookkeeper and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The bookkeeper carries out the process of procuring goods, works and services.";
    }
}