
package app.Toppings;

import app.Decoration.ToppingDecorator;
import app.Pizzas.Pizza;

public class Bacon extends ToppingDecorator {
    Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Bacon"+"\n";
    }

    @Override
    public int cost() {
        return 50 + pizza.cost();
    }
}
