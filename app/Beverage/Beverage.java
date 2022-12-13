
package app.Beverage;
import app.Product.Meals;

public abstract class Beverage extends Meals{
    String info = "";
    @Override
    public String getDescription() {
        return info;
    }
    public abstract String prepareBeverage();
    public abstract int cost();

}

