public class Main {

    public static void main(String[] args) {
        int[] days = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int day: days) {
            DayOfTheWeek.printDayOfTheWeekVersionOne(day);
            DayOfTheWeek.printDayOfTheWeekVersionTwo(day);
        }
    }
}
