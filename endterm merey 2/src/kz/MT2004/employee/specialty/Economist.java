package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Administration;

public class Economist extends Employee implements Administration {

    public Economist() {
        this.setSpecialty("Economist");
    }

    @Override
    public String AdminWork() {
        return "In Administration department I work as Economist and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The economist plans financial and economic activities.";
    }
}


