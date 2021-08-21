public class MinutesToYearsDaysCalculator {
    public static final int HourToMinutes = 60;
    public static final int DayToHours = 24;
    public static final int YearToDays = 365;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (YearToDays * DayToHours * HourToMinutes);
            long remainingDaysInMinutes = minutes % (YearToDays * DayToHours * HourToMinutes);
            long remainingDays = remainingDaysInMinutes / (DayToHours * HourToMinutes);

            System.out.println(minutes + " min" + " = " + years + " y and " + remainingDays + " d");
        }
    }
}
