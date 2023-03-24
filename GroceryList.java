import java.util.*;
public class GroceryList {
    public ArrayList <GroceryItemOrder> grocery_list = new ArrayList<>();

    public GroceryList(){
         ArrayList <GroceryItemOrder> grocery_list = new ArrayList<GroceryItemOrder>();
    }
    public void add(GroceryItemOrder item){
        if(grocery_list.size() < 10)
            grocery_list.add(item);
    }
    public double getTotal_cost(){
        int sum = 0;
        for (int i = 0; i < grocery_list.size(); i++){
            sum += grocery_list.get(i).getCost();
        }
        return sum;
    }

}

