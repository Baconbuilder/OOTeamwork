
package app;

public class TotalCostSub extends TotalCost{
    public void settotalCost(int ans){
        All_totalCost+=ans;
    }
    public int gettotalCost(){
        return All_totalCost;
    }
}
