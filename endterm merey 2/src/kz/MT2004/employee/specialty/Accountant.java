package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Administration;

//Specialty classes
//in specialty classes we followed Dependency inversion principle
//interface segregation principle
//liskov's substitution principle
//single responsibility principle
public class Accountant extends Employee implements Administration {
    @Override
    public String AdminWork() {
        return "In Administration department I work as Accoutant and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The accountant is in charge of asset and inventory accounting, " +
                "travel expenses, fuel and cash operations";
    }
}
