package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class Producer extends Employee implements Media {

    public Producer() {
        this.setSpecialty("Producer");
    }

    @Override
    public String MediaWork() {
        return "In Media department I work as Producer and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "Producer sponsors the production of the show.";
    }
}
