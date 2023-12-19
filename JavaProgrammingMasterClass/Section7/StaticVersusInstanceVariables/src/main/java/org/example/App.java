package org.example;

public class App {
    private static String firstClassName = "firstClassName";

    private static String secondClassName;

    public String getFirstClassNameFromObject() {
        return firstClassName;
    }

    public static String getFirstClassName() {
        return firstClassName;
    }

    public static String getSecondClassName() {
        return secondClassName;
    }

    public static void setSecondClassName(String secondClassName) {
        App.secondClassName = secondClassName;
    }

    public App(String secondClassName) {
        App.secondClassName = secondClassName;
    }
}
