import java.util.*;
public class Main {
    public static void main(String[] args) {
        GroceryItemOrder one = new GroceryItemOrder("apple" , 2 , 10);
        GroceryItemOrder two = new GroceryItemOrder("mango" , 3 , 5);
        GroceryItemOrder three = new GroceryItemOrder("milk" , 20);
        GroceryList list = new GroceryList();
        list.add(one);
        list.add(two);
        list.add(three);
        double cost = list.getTotal_cost();
        System.out.println("the cost is: " + cost);

    }
}
/*
    2) public static int max(ArrayList<int> list){
            if(list.size() == 0 || list.size() == NULL)
                return NULL;
            int max_val = list.get(0); // ||max = Collections.max(list);
            for (int i = 0; i < list.size(); i++){
                if (list.get(i) > max)
                    max = list.get(i);
            }
            return max;
    }

    3) public static void sort(ArrayList<int> list){
            //Collections.sort(list);
            for (int i = 0; i < list.size(); i++){
                for (int j = list.size()-1; j > i; j--){
                    int temp = list.get(i);
                    if (temp > list.get(j)){
                        list.get(i) = list.get(j);
                        list.get(j) = temp;
                    }
                }
            }
    }
 */