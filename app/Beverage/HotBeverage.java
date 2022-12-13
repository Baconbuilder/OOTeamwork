
package app.Beverage;

public abstract class HotBeverage extends Beverage {
    public abstract int cost();
    public abstract String getDescription();

    //template method
    @Override
    public String prepareBeverage() {
        String text;
        text=boilWater();
        text+=pourInCup();

        if(Condiment()) {
            text+=addCondiment();
        }
        return text;
    }
    

    public String boilWater(){
        //System.out.println("Boiling water");
        return "Boiling water\n";
    }

    public String pourInCup(){
        //System.out.println("Pouring into cup");
        return "Pouring into cup\n";
    }
  

    public abstract String addCondiment();

    boolean Condiment(){
        return true;
    }
}
