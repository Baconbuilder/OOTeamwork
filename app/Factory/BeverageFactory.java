
package app.Factory;
import app.Beverage.*;

public class BeverageFactory extends MakeOrder{
    
    @Override
    public Object makeOrder(String option, Object order) {
        if (option.equals(null)){
            return null;
        }
        else if(option.equals("Coffee")){
            return new Coffee();
        }
        else if(option.equals("IceCoffee")){
            return new IceCoffee();
        }
        else if(option.equals("Cola")){
            return new Cola();
        }else if(option.equals("Tea")){
            return new Tea();
        }
        
        return (Beverage)order;
    }

}
