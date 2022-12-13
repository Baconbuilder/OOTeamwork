
package app.Beverage;

public class Cola extends ColdBeverage{
    @Override
    public int cost() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Coca Cola";
    }
}
