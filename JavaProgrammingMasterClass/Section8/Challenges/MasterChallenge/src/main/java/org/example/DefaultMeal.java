package org.example;

public class DefaultMeal extends BasicMeal {

    public DefaultMeal() {
        super(new BasicHamburger(), new SideItem("Coke", 6.99, "Medium"),
            new Item("Cheese", 1.50), new Item("Ketchup", 1.00),
                new Item("Mustard", 1.00)
       );
    }
}
