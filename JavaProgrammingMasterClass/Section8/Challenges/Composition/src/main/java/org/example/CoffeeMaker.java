package org.example;

public class CoffeeMaker extends ApplianceState {

    public void addWater() {
        this.setHasWorkToDo(true);
    }
}
