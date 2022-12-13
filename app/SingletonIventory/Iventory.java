package app.SingletonIventory;
public class Iventory{
    static private int PizzaI = 100;
    static private int BeverageI = 80;
/*----------------------Pizza------------------------ */
    public void setPizzaIventory(int s){
        this.PizzaI = s;
    }

    public int GetPizzaInstance(){
        return this.PizzaI;
    }
/*----------------------Beverage------------------------ */
    public void setBeverageIventory(int s){
        this.BeverageI = s;
    }

    public int GetBeverageInstance(){
        return this.BeverageI;
    }
    
    
}
