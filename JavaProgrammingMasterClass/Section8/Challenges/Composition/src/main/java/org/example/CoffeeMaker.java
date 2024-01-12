package org.example;

public class CoffeeMaker extends ApplianceState {

    public String brewCoffee() {
        String brewCoffee = this.isHasWorkToDo() ? "The coffee maker is brewing coffee." : "";
        this.setHasWorkToDo(false);
        return brewCoffee;
    }
}
