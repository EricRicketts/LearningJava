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
        // this is a complete call to the static variable "firstClassName"
        return App.firstClassName;
    }

    public static void setFirstClassName(String firstClassName) {
        // this is needed as the complete call of the static variable "firstClassName" is needed
        // to distinguish between it and the parameter "firstClassName" being passed in
        App.firstClassName = firstClassName;
    }

    public static String getSecondClassName() {
        // since this is a static variable being called from a static method and both are in the same
        // class it is not necessary to prepend the static method with the class name "App".
        return secondClassName;
    }

    public static void setSecondClassName(String secondClassName) {
        App.secondClassName = secondClassName;
    }

    public String getFirstClassNameFromObjectVersionOne() {
        // Instance methods can call static methods
        return App.getFirstClassName();
    }

    public String getFirstClassNameFromObjectVersionTwo() {
        // Instance methods can call static methods, if called from the same class
        // there is no need to prepend the class name
        return getFirstClassName();
    }

    public String getSecondClassNameFromObjectVersionOne() {
        // instance methods can call static variables in the same class
        return App.secondClassName;
    }

    public String getSecondClassNameFromObjectVersionTwo() {
        // instance methods can call static variables in the same class
        // if called from the same class there is no need to prepend the class name
        return secondClassName;
    }

    public App(String secondClassName) {
        App.secondClassName = secondClassName;
    }
}
