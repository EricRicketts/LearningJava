package org.example;

public class DeluxeMeal {

    private Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;
    private Item fourthTopping;
    private Item fifthTopping;
    private final Hamburger hamburger;
    private final Drink drink;
    private final SideItem sideItem;

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public Item getFirstTopping() {
        return firstTopping;
    }

    public void setFirstTopping(Item firstTopping) {
        this.firstTopping = firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public void setSecondTopping(Item secondTopping) {
        this.secondTopping = secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    public void setThirdTopping(Item thirdTopping) {
        this.thirdTopping = thirdTopping;
    }

    public Item getFourthTopping() {
        return fourthTopping;
    }

    public void setFourthTopping(Item fourthTopping) {
        this.fourthTopping = fourthTopping;
    }

    public Item getFifthTopping() {
        return fifthTopping;
    }

    public void setFifthTopping(Item fifthTopping) {
        this.fifthTopping = fifthTopping;
    }

    public double getPrice() {
        return 19.99;
    }

    public DeluxeMeal() {
        this.hamburger = new Hamburger("Large");
        this.drink = new Drink("Large", "Coke");
        this.sideItem = new SideItem("Large", "Fries");
    }
}
