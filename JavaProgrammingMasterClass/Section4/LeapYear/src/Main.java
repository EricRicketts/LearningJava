public class Main {

    public static void main(String[] args) {
        int[] years = {-1600, 1600, 2017, 2000, 2024};
        for (int year: years) {
            System.out.println(LeapYear.isLeapYear(year));
        }
    }
}
