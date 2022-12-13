
package app.Crusts;

import app.Decoration.CrustDecorator;
import app.Pizzas.Pizza;

public class CheeseCrust extends CrustDecorator {
    Pizza pizza;

    public CheeseCrust(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with cheese crust";
    }

    @Override
    public int cost() {
        return 50 + pizza.cost(); // cheese crust costs extra 50 NTD
    }
}