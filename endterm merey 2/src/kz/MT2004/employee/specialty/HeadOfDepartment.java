package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.WorkerManagement;

public class HeadOfDepartment extends Employee implements WorkerManagement{
    @Override
    public String WorkM() {
        return "In Worker department I work as Head of Department and i like my job in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "the head of the department is responsible for economic affairs.";
    }
}
