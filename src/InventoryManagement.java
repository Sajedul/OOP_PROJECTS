import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    static HashMap<String,Integer> inventory=new HashMap<>();

    public static void addItem(String item,int quantity){
        inventory.put(item,inventory.getOrDefault(item,0)+quantity);
    }

    public static void updateItemQuantity(String item,int quantity){
        if(inventory.containsKey(item)){
            inventory.put(item,quantity);
        }else {
            System.out.println("Item not present in the inventory");
        }
    }

    public static Integer getItemQuantity(String item){
        return inventory.get(item);
    }

    public static void printAllItems(){
        for (String item:inventory.keySet()
             ) {
            System.out.println(item+" : "+inventory.get(item));
        }
    }


}
