package org.example;

public class BasicMeal extends Meal {

    private Item firstTopping;
    private Item secondTopping = new Item("Nothing", 0.00);
    private Item thirdTopping = new Item("Nothing", 0.00);
    private double price;

    public void setFirstTopping(Item firstTopping) {
        this.firstTopping = firstTopping;
    }

    public void setSecondTopping(Item secondTopping) {
        this.secondTopping = secondTopping;
    }

    public void setThirdTopping(Item thirdTopping) {
        this.thirdTopping = thirdTopping;
    }

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

    public BasicMeal() {
        super(new BasicHamburger(), new SideItem("Coke", 6.99, "Medium"));
        this.price = super.getPrice();
    }
    public BasicMeal(Hamburger burger, SideItem drink, Item firstTopping) {
        super(burger, drink);
        this.firstTopping = firstTopping;
        this.price = super.getPrice() + firstTopping.getPrice();
    }

    public BasicMeal(Hamburger burger, SideItem drink, Item firstTopping, Item secondTopping) {
        super(burger, drink);
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
        this.price = super.getPrice() + firstTopping.getPrice() + secondTopping.getPrice();
    }

    public BasicMeal(Hamburger burger, SideItem drink, Item firstTopping,
                     Item secondTopping, Item thirdTopping
    ) {
        super(burger, drink);
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
        this.thirdTopping = thirdTopping;
        this.price = super.getPrice() + firstTopping.getPrice() + secondTopping.getPrice() +
                thirdTopping.getPrice();
    }
}
