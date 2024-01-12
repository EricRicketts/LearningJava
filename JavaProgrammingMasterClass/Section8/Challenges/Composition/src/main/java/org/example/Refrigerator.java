package org.example;

public class Refrigerator extends ApplianceState {

    public String orderFood() {
        String orderFood = this.isHasWorkToDo() ? "The Refrigerator is ordering food." : "";
        this.setHasWorkToDo(false);
        return orderFood;
    }
}
