
package app.Crusts;

import app.Decoration.CrustDecorator;
import app.Pizzas.Pizza;

public class ThickCrust extends CrustDecorator {
    Pizza pizza;

    public ThickCrust(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with thick crust";
    }

    @Override
    public int cost() {
        return 0 + pizza.cost(); // thick crust doesn't cost extra money
    }
}
