package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Administration;

public class Axeman extends Employee implements Administration {
    @Override
    public String AdminWork() {
        return "In Administration department I work as Axeman and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return null;
    }
}