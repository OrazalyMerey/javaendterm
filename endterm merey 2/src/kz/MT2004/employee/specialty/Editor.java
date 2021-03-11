package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class Editor extends Employee implements Media {
    @Override
    public String MediaWork() {
        return "In Media department I work as Editor and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "Editor prepares news items.";
    }
}
