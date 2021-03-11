package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class Decorater extends Employee implements Media {
    @Override
    public String MediaWork() {
        return "In Media department I work as Decorator and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "A decorator decorates the studio for a reenactment show.";
    }
}




