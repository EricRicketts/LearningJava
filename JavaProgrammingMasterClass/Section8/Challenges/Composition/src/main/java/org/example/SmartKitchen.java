package org.example;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private DishWasher dishWasher;

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

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public void addWater() {
        this.getCoffeeMaker().setHasWorkToDo(true);
    }

    public void pourMilk() {
        this.getRefrigerator().setHasWorkToDo(true);
    }

    public void loadDishWasher() { this.getDishWasher().setHasWorkToDo(true); }

    public void setKitchenState(
            boolean coffeeMakerState, boolean refrigeratorState, boolean dishWasherState
    ) {
        if (coffeeMakerState) addWater();
        if (refrigeratorState) loadDishWasher();
        if (dishWasherState) loadDishWasher();
    }

    public SmartKitchen() {
        this.setCoffeeMaker(new CoffeeMaker());
        this.setRefrigerator(new Refrigerator());
        this.setDishWasher(new DishWasher());
    }

}
