package org.example;

public class DeluxeMeal extends Meal {

    private Item fourthTopping;
    private Item fifthTopping;



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
        super(new Hamburger("Large"), new Drink("Large", "Coke"),
                new SideItem("Large", "Fries"));
    }
}
