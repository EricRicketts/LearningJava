package org.example;

import java.util.List;
import java.util.Objects;

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

    @Override
    protected List<Item> getAllToppings() {
        List<Item> toppingsList = super.getAllToppings();
        if (!Objects.isNull(this.getFourthTopping())) toppingsList.add(this.getFourthTopping());
        if (!Objects.isNull(this.getFifthTopping())) toppingsList.add(this.getFifthTopping());

        return toppingsList;
    }

    public void setAllToppings(List<Item> desiredToppings) {
        for (int index = 0; index < desiredToppings.size(); index++) {
            switch (index) {
                case 0: {
                    this.setFirstTopping(desiredToppings.get(index));
                    this.getFirstTopping().setPrice(0.00);
                }
                case 1: {
                    this.setSecondTopping(desiredToppings.get(index));
                    this.getSecondTopping().setPrice(0.00);
                }
                case 2: {
                    this.setThirdTopping(desiredToppings.get(index));
                    this.getThirdTopping().setPrice(0.00);
                }
                case 3: {
                    this.setFourthTopping(desiredToppings.get(index));
                    this.getFourthTopping().setPrice(0.00);
                }
                case 4: {
                    this.setFifthTopping(desiredToppings.get(index));
                    this.getFifthTopping().setPrice(0.00);
                }
            }
        }
    }

    public DeluxeMeal(Item drink, Item side) {
        super(new Hamburger("Deluxe"), drink, side);
        drink.setPrice(0.00);
        side.setPrice(0.00);
    }
}
