package org.example;

public class App {

    public static String firstSwitchStatement(int value) {
        String result = "";
        switch (value) {
            case 1: {
                result = "value is 1";
                break;
            }
            case 2: {
                result = "value is 2";
                break;
            }
            case 3: case 4: case 5: {
                result = "case testing for 3, 4, or 5 on one line.  Value is " + value;
                break;
            }
            default: {
                result = "value is not 1, 2, 3, 4, or 5";
            }
        }
        return result;
    }
}
