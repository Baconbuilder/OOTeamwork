package app.SingletonIventory;

public class MoveInOut {
    //public Iventory iventory;
    Iventory iventory = new Iventory();
    /*public MoveInOut(Iventory it){
        iventory = it;
    }*/
    /*----------------------Pizza------------------------ */
    public void PizzamoveIn(int i){
        iventory.setPizzaIventory(iventory.GetPizzaInstance()+i);
    }
    public void PizzamoveOut(int i){
        iventory.setPizzaIventory(iventory.GetPizzaInstance()-i);
    }
    /*----------------------Beverage------------------------ */
    public void BeveragemoveIn(int i){
        iventory.setBeverageIventory(iventory.GetBeverageInstance()+i);
    }
    public void BeveragemoveOut(int i){
        iventory.setBeverageIventory(iventory.GetBeverageInstance()-i);
    }
}
