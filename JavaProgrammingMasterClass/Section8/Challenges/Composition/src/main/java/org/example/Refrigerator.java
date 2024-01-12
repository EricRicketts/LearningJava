package org.example;

public class Refrigerator extends ApplianceState {

    public String orderFood() { return this.isHasWorkToDo() ? "The Refrigerator is ordering food." : ""; }
}
