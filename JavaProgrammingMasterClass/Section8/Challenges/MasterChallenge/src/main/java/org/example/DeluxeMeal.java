package org.example;

public class DeluxeMeal extends Meal {

    private Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;
    private Item fourthTopping;
    private Item fifthTopping;

    private Item convertStringToNoCostItem(String itemName) {
        return new Item(itemName, 0.00);
    }

    @Override
    public double getPrice() {
        return 15.99;
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

    public Item getFirstTopping() {
        return firstTopping;
    }

    public Item getSecondTopping() {
        return secondTopping;
    }

    public Item getThirdTopping() {
        return thirdTopping;
    }

    public Item getFourthTopping() {
        return fourthTopping;
    }

    public Item getFifthTopping() {
        return fifthTopping;
    }

    public DeluxeMeal(String firstTopping) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = convertStringToNoCostItem(firstTopping);
    }

    public DeluxeMeal(String firstTopping, String secondTopping) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = convertStringToNoCostItem(firstTopping);
        this.secondTopping = convertStringToNoCostItem(secondTopping);
    }

    public DeluxeMeal(String firstTopping, String secondTopping, String thirdTopping) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = convertStringToNoCostItem(firstTopping);
        this.secondTopping = convertStringToNoCostItem(secondTopping);
        this.thirdTopping = convertStringToNoCostItem(thirdTopping);
    }

    public DeluxeMeal(String firstTopping, String secondTopping,
                      String thirdTopping, String fourthTopping
    ) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = convertStringToNoCostItem(firstTopping);
        this.secondTopping = convertStringToNoCostItem(secondTopping);
        this.thirdTopping = convertStringToNoCostItem(thirdTopping);
        this.fourthTopping = convertStringToNoCostItem(fourthTopping);
    }

    public DeluxeMeal(String firstTopping, String secondTopping, String thirdTopping,
                      String fourthTopping, String fifthTopping
    ) {
        super(new Hamburger("Deluxe", 0.00), new SideItem("Coke", 0.00, "Large"));
        this.firstTopping = convertStringToNoCostItem(firstTopping);
        this.secondTopping = convertStringToNoCostItem(secondTopping);
        this.thirdTopping = convertStringToNoCostItem(thirdTopping);
        this.fourthTopping = convertStringToNoCostItem(fourthTopping);
        this.fifthTopping = convertStringToNoCostItem(fifthTopping);
    }
}
