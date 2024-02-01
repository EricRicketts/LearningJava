package org.example;

public class HamburgerWithToppings extends Hamburger {

    private final Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;
    private final double totalPrice;

    public Item getFirstTopping() {
        return firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public HamburgerWithToppings(String size, String firstToppingType) {
        super(size);
        this.firstTopping = new Item(firstToppingType);
        this.totalPrice = super.getPrice() + this.firstTopping.getPrice();
    }

    public HamburgerWithToppings(String size, String firstToppingType, String secondToppingType) {
        super(size);
        this.firstTopping = new Item(firstToppingType);
        this.secondTopping = new Item(secondToppingType);
        this.totalPrice = super.getPrice() + this.firstTopping.getPrice() + this.secondTopping.getPrice();
    }

    public HamburgerWithToppings(String size, String firstToppingType,
                                 String secondToppingType, String thirdToppingType
    ) {
        super(size);
        this.firstTopping = new Item(firstToppingType);
        this.secondTopping = new Item(secondToppingType);
        this.thirdTopping = new Item(thirdToppingType);
        this.totalPrice = super.getPrice() + this.firstTopping.getPrice()
                + this.secondTopping.getPrice() + this.thirdTopping.getPrice();
    }
}
