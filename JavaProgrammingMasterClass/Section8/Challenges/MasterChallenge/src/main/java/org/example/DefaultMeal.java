package org.example;

public class DefaultMeal extends BasicMeal {

    public DefaultMeal() {
        super(new BasicHamburger(), new SideItem("Coke", 6.99, "Medium"),
            "Cheese", "Ketchup", "Mustard");
    }
}
