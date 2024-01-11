package org.example;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;

    private Refrigerator refrigerator;

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void addWater() {
        this.getCoffeeMaker().setHasWorkToDo(true);
    }

    public void pourMilk() {
        this.getRefrigerator().setHasWorkToDo(true);
    }

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker();
        this.refrigerator = new Refrigerator();
    }

}
