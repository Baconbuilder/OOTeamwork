
package app;
import app.Factory.*;
import app.Pizzas.*;

public class StrategyPizza implements SelectStrategy{
    PizzaUI pizza=new PizzaUI();
    public String execute(){
        
        pizza.setVisible(true);
        
        String ans="";
        return ans;
    }
}
