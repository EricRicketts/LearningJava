package org.example;

public class CoffeeMaker extends ApplianceState {

    public String brewCoffee() {
        return this.isHasWorkToDo() ? "The coffee maker is brewing coffee." : "";
    }
}
