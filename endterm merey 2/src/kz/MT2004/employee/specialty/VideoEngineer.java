package kz.MT2004.employee.specialty;

import kz.MT2004.employee.Employee;
import kz.MT2004.employee.department.TechnicalManagement;

public class VideoEngineer extends Employee implements TechnicalManagement {
    @Override
    public String TechWork() {
        return "In Technical department I work as Video Engineer and i like my job in REYDI";
    }

    @Override
    public String SpecialtyInfo() {
        return "The video engineer is responsible for the technical part of the picture quality.";
    }
}
