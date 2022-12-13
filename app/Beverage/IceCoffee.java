
package app.Beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class IceCoffee extends ColdBeverage{
    int cost = 70;

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "IceCoffee";
    }

    @Override
 
    public String addCondiment() {
        //System.out.println("Adding milk");
        return "Adding milk\n";
    }



    //hook
    public boolean Condiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 10;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        answer=JOptionPane.showInputDialog("Would you like milk? --- $10 (y/n)");
        //System.out.println("Would you like milk? --- $10 (y/n)");

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
