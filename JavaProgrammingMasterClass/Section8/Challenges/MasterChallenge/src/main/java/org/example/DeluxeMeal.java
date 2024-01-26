package org.example;

public class DeluxeMeal extends Meal {

    private Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;
    private Item fourthTopping;
    private Item fifthTopping;
    private final double price = 15.99;

    @Override
    public double getPrice() {
        return price;
    }

    public void setFirstTopping(Item firstTopping) {
        this.firstTopping = firstTopping;
    }

    public void setSecondTopping(Item secondTopping) {
        this.secondTopping = secondTopping;
    }

    public void setThirdTopping(Item thirdTopping) {
        this.thirdTopping = thirdTopping;
    }

    public void setFourthTopping(Item fourthTopping) {
        this.fourthTopping = fourthTopping;
    }

    public void setFifthTopping(Item fifthTopping) {
        this.fifthTopping = fifthTopping;
    }

    public DeluxeMeal(String firstTopping) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = new Item(firstTopping, 0.00);
    }

    public DeluxeMeal(Item firstTopping, Item secondTopping) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
    }

    public DeluxeMeal(Item firstTopping, Item secondTopping, Item thirdTopping) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
        this.thirdTopping = thirdTopping;
    }

    public DeluxeMeal(Item firstTopping, Item secondTopping,
                      Item thirdTopping, Item fourthTopping
    ) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
        this.thirdTopping = thirdTopping;
        this.fourthTopping = fourthTopping;
    }

    public DeluxeMeal(Item firstTopping, Item secondTopping, Item thirdTopping,
                      Item fourthTopping, Item fifthTopping
    ) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
        this.thirdTopping = thirdTopping;
        this.fourthTopping = fourthTopping;
        this.fifthTopping = fifthTopping;
    }
}
