package org.example;

public class App {
    private static String firstClassName = "firstClassName";

    private static String secondClassName;

    public String getInstanceVariable() {
        return instanceVariable;
    }

    public void setInstanceVariable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    private String instanceVariable;

    public static String getFirstClassName() {
        return firstClassName;
    }

    public static void setFirstClassName(String firstClassName) {
        App.firstClassName = firstClassName;
    }

    public static String getSecondClassName() {
        return secondClassName;
    }

    public static void setSecondClassName(String secondClassName) {
        App.secondClassName = secondClassName;
    }

    public String getFirstClassNameFromObject() {
        return firstClassName;
    }

    public String getSecondClassNameFromObject() {
        return secondClassName;
    }

    public App(String secondClassName) {
        App.secondClassName = secondClassName;
    }
}
