package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.Media;

public class VideoMaker extends Employee implements Media {
    @Override
    public String MediaWork() {
        return "In Media department I work as Video Maker and i like my work in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "A video maker edits the filming process.";
    }
}
