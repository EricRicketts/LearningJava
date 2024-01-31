package org.example;

public class HamburgerWithToppings extends Hamburger {

    private final Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;
    private Double totalPrice;

    public Item getFirstTopping() {
        return firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public HamburgerWithToppings(String size, double price, String firstToppingType, Double firstToppingPrice) {
        super(size, price);
        this.firstTopping = new Item(firstToppingType, firstToppingPrice);
        this.setTotalPrice(super.getPrice() + this.firstTopping.getPrice());
    }

    public HamburgerWithToppings(String type, double price, String firstToppingType, Double firstToppingPrice,
                                 String secondToppingType, Double secondToppingPrice
    ) {
        super(type, price);
        this.firstTopping = new Item(firstToppingType, firstToppingPrice);
        this.secondTopping = new Item(secondToppingType, secondToppingPrice);
        this.setTotalPrice(super.getPrice() + this.firstTopping.getPrice() + this.secondTopping.getPrice());
    }

    public HamburgerWithToppings(String type, double price, String firstToppingType, Double firstToppingPrice,
                                 String secondToppingType, Double secondToppingPrice,
                                 String thirdToppingType, Double thirdToppingPrice
    ) {
        super(type, price);
        this.firstTopping = new Item(firstToppingType, firstToppingPrice);
        this.secondTopping = new Item(secondToppingType, secondToppingPrice);
        this.thirdTopping = new Item(thirdToppingType, thirdToppingPrice);
        this.setTotalPrice(super.getPrice() + this.firstTopping.getPrice()
                + this.secondTopping.getPrice() + this.thirdTopping.getPrice());
    }
}
