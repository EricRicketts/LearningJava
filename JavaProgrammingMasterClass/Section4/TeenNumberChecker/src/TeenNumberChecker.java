public class TeenNumberChecker {

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        int[] ageArray = {ageOne, ageTwo, ageThree};

        for (int age: ageArray) { if (isTeen(age)) return true; }
        return false;
    }

    public static boolean isTeen(int age) {
       return (age >= 13 && age <= 19);
    }
}
