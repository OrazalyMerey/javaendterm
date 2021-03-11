package kz.MT2004.employee.department;

//Release and Analysis department, specialties from this department implements Release and Analysis
public interface DepartmentOfReleaseAndAnalysis{
    public static String RelAlINfo() {
        return "    A department of release and analysis works directly with airtime. Its employees " +
                "control all sounds, \n" + "oversee network connection, controls video broadcast and responsible for " +
                "broadcasting.\n";
    }
    String DepWork();
}
