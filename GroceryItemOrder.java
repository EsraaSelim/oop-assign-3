import java.util.*;
public class GroceryItemOrder {
    public String item_name;
    public int quantity;
    public double price_unit;

    public GroceryItemOrder(String item_name, int quantity, double price_unit) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price_unit = price_unit;
    }
    public GroceryItemOrder(String item_name , double price_unit){
        this.item_name = item_name;
        this.price_unit = price_unit;
    }
    public double getCost(){
        return price_unit * quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

}
