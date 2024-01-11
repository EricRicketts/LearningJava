package org.example;

public class DishWasher extends ApplianceState {

    public String doDishes() {
        return this.isHasWorkToDo() ? "The dishwasher is washing the dishes." : "";
    }
}
