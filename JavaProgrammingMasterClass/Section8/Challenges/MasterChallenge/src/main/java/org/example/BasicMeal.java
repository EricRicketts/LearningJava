package org.example;

import java.util.HashMap;
import java.util.Map;

public class BasicMeal extends Meal {

    private final Item genericItem = new Item("Generic", 0.00);
    private Item firstTopping = genericItem;
    private Item secondTopping = genericItem;
    private Item thirdTopping = genericItem;
    private final double price;
    protected HashMap<String, Double> toppingsTypeAndPrice = new HashMap<>(Map.of(
            "Lettuce", 1.00, "Tomatoes", 1.00, "Ketchup", 1.00, "Mustard", 1.00,
            "Mayonnaise", 1.00, "Onion", 1.00, "Relish", 1.00, "Pickles", 1.00,
            "Cheese", 1.50
        )
    );

    public Item getFirstTopping() {
        return firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    @Override
    public double getPrice() {
        return price;
    }

    protected Item[] setToppings(String[] chosenToppingTypes, Item[] toppings) {
        for (int index = 0; index < chosenToppingTypes.length; index++) {
            String chosenToppingType = chosenToppingTypes[index];
            Double chosenToppingPrice = toppingsTypeAndPrice.get(chosenToppingType);
            toppings[index] = new Item(chosenToppingType, chosenToppingPrice);
        }
        return toppings;
    }

    public BasicMeal() {
        super("Medium", "Medium", "Coke");
        this.price = super.getPrice();
    }
    public BasicMeal(String burgerSize, String drinkSize, String drinkType, String firstToppingType) {
        super(burgerSize, drinkSize, drinkType);
        this.firstTopping = setToppings(new String[]{firstToppingType}, new Item[]{this.firstTopping})[0];
        this.price = super.getPrice() + this.firstTopping.getPrice();
    }

    public BasicMeal(String burgerType, String drinkSize, String drinkType,
                     String firstToppingType, String secondToppingType
    ) {
        super(burgerType, drinkSize, drinkType);
        Item[] toppings = setToppings(
                new String[]{firstToppingType, secondToppingType},
                new Item[]{this.firstTopping, this.secondTopping}
        );
        this.firstTopping = toppings[0];
        this.secondTopping = toppings[1];
        this.price = super.getPrice() + this.firstTopping.getPrice() + this.secondTopping.getPrice();
    }

    public BasicMeal(String burgerType, String drinkSize, String drinkType,
                     String firstToppingType, String secondToppingType, String thirdToppingType
    ) {
        super(burgerType, drinkSize, drinkType);
        Item[] toppings = setToppings(
                new String[]{firstToppingType, secondToppingType, thirdToppingType},
                new Item[]{this.firstTopping, this.secondTopping, this.thirdTopping}
        );
        this.firstTopping = toppings[0];
        this.secondTopping = toppings[1];
        this.thirdTopping = toppings[2];
        this.price = super.getPrice() + this.firstTopping.getPrice() +
                this.secondTopping.getPrice() + this.thirdTopping.getPrice();
    }
}
