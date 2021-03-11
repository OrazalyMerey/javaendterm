package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class Projectionist extends Employee implements Media {
    @Override
    public String MediaWork() {
        return"In Media department I work as Projectionist and i like my job in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The projectionist takes the footage.";
    }
}