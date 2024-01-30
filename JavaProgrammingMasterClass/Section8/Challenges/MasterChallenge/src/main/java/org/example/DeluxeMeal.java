package org.example;

public class DeluxeMeal extends Meal {

    private Item firstTopping;
    private Item secondTopping;
    private Item thirdTopping;
    private Item fourthTopping;
    private Item fifthTopping;

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

    public DeluxeMeal(String firstToppingType) {
        super(new Hamburger("Large", 0.00), new SideItem("Coke", 0.00, "Large"));
    }

    public DeluxeMeal(String firstToppingType, String secondToppingType) {
        super(new Hamburger("Large", 0.00), new SideItem("Coke", 0.00, "Large"));
    }

    public DeluxeMeal(String firstToppingType, String secondToppingType, String thirdToppingType) {
        super(new Hamburger("Large", 0.00), new SideItem("Coke", 0.00, "Large"));
    }

    public DeluxeMeal(String firstToppingType, String secondToppingType,
                      String thirdToppingType, String fourthToppingType
    ) {
        super(new Hamburger("Large", 0.00), new SideItem("Coke", 0.00, "Large"));
    }

    public DeluxeMeal(String firstToppingType, String secondToppingType, String thirdToppingType,
                      String fourthToppingType, String fifthToppingType
    ) {
        super(new Hamburger("Large", 0.00), new SideItem("Coke", 0.00, "Large"));
    }
}
