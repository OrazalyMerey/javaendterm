package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class HeadProducer extends Employee  implements Media {

    public HeadProducer(int employee_id) {
        this.setSpecialty("Head producer");
        this.setEmployee_id(employee_id);
    }
    public HeadProducer() {

    }

    @Override
    public String MediaWork() {
        return "In Media department I work as Head Producer and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The head producer organizes the filming of the shows.";
    }
}


