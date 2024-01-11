package org.example;

public class CoffeeMaker extends ApplianceState {

    public String brewCoffee() {
        return this.isHasWorkToDo() ? "The Coffee maker is brewing coffee." : "";
    }
}
