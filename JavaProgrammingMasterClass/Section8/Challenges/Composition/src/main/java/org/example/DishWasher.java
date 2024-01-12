package org.example;

public class DishWasher extends ApplianceState {

    public String doDishes() {
        String doDishes = this.isHasWorkToDo() ? "The dishwasher is washing the dishes." : "";
        this.setHasWorkToDo(false);
        return doDishes;
    }
}
