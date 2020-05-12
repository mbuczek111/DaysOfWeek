import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum DaysOfWeek {
    MON("Poniedziałek","Monday", true),
    TUE("Wtorek","Tuesday",true),
    WED("Środa","Wednesday", true),
    THU("Czwartek", "Thursday", true),
    FRI("Piątek", "Friday", true),
    SAT("Sobota", "Saturday", false),
    SUN("Niedziela", "Sunday", false);

    private String polishName;
    private String englishName;
    private boolean workingDay;

    DaysOfWeek(String polishName, String englishName, boolean workingDay) {
        this.polishName = polishName;
        this.englishName = englishName;
        this.workingDay = workingDay;
    }

    public String getPolishName() {
        return polishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }
    public static DaysOfWeek fromPolishName(String polishName) {
        for (DaysOfWeek day : values()) {
            if (day.polishName.equals(polishName)) {
                return day;
            }
        }
        throw new IllegalArgumentException("There is no day of week with \"" + polishName + "\" Polish name");
    }
    public static DaysOfWeek fromEnglishName(String englishName) {
        for (DaysOfWeek day : values()) {
            if (day.englishName.equals(englishName)) {
                return day;
            }
        }
        throw new IllegalArgumentException("There is no day of week with \"" + englishName + "\" English name");
    }
    public static boolean isWeekend(DaysOfWeek day)
    {
        if(!day.workingDay)
        {
            return true;
        }
        return false;
    }
    public static ArrayList <DaysOfWeek> getWeekends(){
        ArrayList<DaysOfWeek> days = new ArrayList<DaysOfWeek>();
        for (DaysOfWeek day : values()) {
            if (day.isWorkingDay()==false) {
                days.add(day);
            }
        }
        return days;
    }
    public static ArrayList <DaysOfWeek> getWorkingDays(){
        ArrayList<DaysOfWeek> days = new ArrayList<DaysOfWeek>();
        for (DaysOfWeek day : values()) {
            if (day.isWorkingDay()==true) {
                days.add(day);
            }
        }
        return days;
    }
}
