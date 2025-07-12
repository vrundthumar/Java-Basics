import java.util.ArrayList;

public class ArrayList {
     public static void main(String[] args) {

        // Array list = a resizable array. Elements can be added or removed after compilation phase. Store reference data types.

        ArrayList<String> food = new ArrayList();
        
        food.add("pizza");
        food.add("burger");
        food.add("hotdog");

        food.set(0, "dosa");  // to change the element
        food.remove(2);       // to remove element
        food.clear();         // to clear whole array.
        
        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
        
     }
}
