
package app;

public class User {
    SelectStrategy ss;
    public String run(){
        return ss.execute();
    }
    public void choiceStrategy(SelectStrategy strategy){
        this.ss=strategy;
    }
    
}
