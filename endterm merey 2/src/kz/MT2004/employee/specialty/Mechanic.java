package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.WorkerManagement;

public class Mechanic extends Employee implements WorkerManagement {
    @Override
    public String WorkM() {
        return "In Worker department I work as Mechanic and i like my job in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "A mechanic carries out minor repairs to the building.";
    }
}