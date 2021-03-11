package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.WorkerManagement;

public class Cleaner extends Employee implements WorkerManagement {
    @Override
    public String WorkM() {
        return "In Worker department I work as Cleaner";
    }

    @Override
    public String SpecialtyInfo() {
        return "The cleaner keeps the building clean.";
    }
}
