package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class HeadEditor extends Employee implements Media {
    @Override
    public String MediaWork() {
        return "In Media department I work as Head Editor and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The head editor manages the creative processes of the editors.";
    }
}