package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class Subhead extends Employee implements Media {
    @Override
    public String MediaWork() {
        return "In Media department I work as Subhead and i like my position in REYDI";
    }

    public Subhead(){
        this.setSpecialty("Subhead");
    }

    @Override
    public String SpecialtyInfo() {
        return "Subhead manages the creative process of the media department.";
    }
}
