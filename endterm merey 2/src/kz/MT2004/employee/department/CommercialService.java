package kz.MT2004.employee.department;

//Commercial Service, specialties from this department implements Commercial Service (Secretary)
public interface CommercialService{
    public static String CommercialInfo() {
        return "    The secretary helps director with answering calls, taking messages and handling " +
                "correspondence, \n" + "maintaining diaries and arranging appointments, typing, preparing and collating " +
                "reports.\n";
    }
    String CommWork();
}