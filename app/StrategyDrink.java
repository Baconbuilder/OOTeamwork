
package app;
import app.Beverage.*;
import app.Factory.BeverageFactory;

public class StrategyDrink implements SelectStrategy{
    DrinkUI drink=new DrinkUI();
    public String execute(){
        String beverageType="";
        
        Beverage orderedBeverage = null;
        BeverageFactory beverageFactory = new BeverageFactory();
        int totalCost = 0;
        
        drink.setVisible(true);
        
        String ans="";
        return ans;
    }
    
}
