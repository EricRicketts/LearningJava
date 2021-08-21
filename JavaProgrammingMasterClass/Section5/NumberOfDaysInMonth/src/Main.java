public class Main {

    public static void main(String[] args) {
        int[] years = {-1600, 1600, 2017, 2000};
        for (int year: years) {
            System.out.println(NumberOfDaysInMonth.isLeapYear(year));
        }

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }
}
