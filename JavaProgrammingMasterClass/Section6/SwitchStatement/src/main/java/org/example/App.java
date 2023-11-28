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
            default: {
                result = "value is neither 1 or 2";
            }
        }
        return result;
    }
}
