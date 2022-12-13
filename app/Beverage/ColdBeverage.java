
package app.Beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public abstract class ColdBeverage extends Beverage{
    public abstract int cost();
    public abstract String getDescription();

    //template method
    @Override
    public String prepareBeverage() {
        String text="";
        if(Ice()) {
            text+=addIce();
        }
        pourInGlass();
        if(getDescription() == "IceCoffee") {
            if(Condiment()){
                text+=addCondiment();
            }
        }
        text+=putPipet();
        return text;
    }

    public String addCondiment() { return "";};
    boolean Condiment(){
        return true;
    }
    public String pourInGlass(){
        //System.out.println("Pouring into glass");
        return "Pouring into glass\n";
    }

    public String putPipet(){
        //System.out.println("Put pipet in glass");
        return "Put pipet in glass\n";
    }

    public String addIce(){
        //System.out.println("Adding ice");
        return "Adding ice\n";
    }

    //hook
    public boolean Ice(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        answer=JOptionPane.showInputDialog("Would you like ice? (y/n)");
        //System.out.println("Would you like ice? (y/n)");

        /*BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        if(answer == null){
            answer = "no";
        }

        return answer;
    }
}
