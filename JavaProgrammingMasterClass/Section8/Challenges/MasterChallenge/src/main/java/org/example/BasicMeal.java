package org.example;

public class BasicMeal extends Meal {

    private Item firstTopping;
    private Item secondTopping = new Item("Nothing", 0.00);
    private Item thirdTopping = new Item("Nothing", 0.00);
    private final double price;

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
    public BasicMeal(Hamburger burger, SideItem drink, String firstTopping) {
        super(burger, drink);
        this.firstTopping = this.convertToBurgerOrTopping(firstTopping);
        this.price = super.getPrice() + this.firstTopping.getPrice();
    }

    public BasicMeal(Hamburger burger, SideItem drink, String firstTopping, String secondTopping) {
        super(burger, drink);
        this.firstTopping = this.convertToBurgerOrTopping(firstTopping);
        this.secondTopping = this.convertToBurgerOrTopping(secondTopping);
        this.price = super.getPrice() + this.firstTopping.getPrice() + this.secondTopping.getPrice();
    }

    public BasicMeal(Hamburger burger, SideItem drink, String firstTopping,
                     String secondTopping, String thirdTopping
    ) {
        super(burger, drink);
        this.firstTopping = this.convertToBurgerOrTopping(firstTopping);
        this.secondTopping = this.convertToBurgerOrTopping(secondTopping);
        this.thirdTopping = this.convertToBurgerOrTopping(thirdTopping);
        this.price = super.getPrice() + this.firstTopping.getPrice() +
                this.secondTopping.getPrice() + this.thirdTopping.getPrice();
    }
}
