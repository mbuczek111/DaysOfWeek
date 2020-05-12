public class DaysOfWeekDemo {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.isWeekend(DaysOfWeek.MON));
        System.out.println(DaysOfWeek.fromEnglishName("Monday"));
        System.out.println(DaysOfWeek.fromPolishName("Poniedziałek"));

        System.out.println(DaysOfWeek.MON.getEnglishName());
        System.out.println(DaysOfWeek.getWeekends());
        System.out.println(DaysOfWeek.getWorkingDays());
    }

}

