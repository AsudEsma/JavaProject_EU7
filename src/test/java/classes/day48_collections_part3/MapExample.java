package classes.day48_collections_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> items2 = new ArrayList<>();
        items2.add(10);

        Map<String, Double> items = new HashMap<>();
        items.put("Apple", 3.49);
        items.put("Orange", 4.99);
        items.put("Banana", 7.90);
        items.put("Eggs", 10.99);
        items.put("Avocado", 4.99);
        items.put("Orange", 5.90);

        System.out.println(items.size());
        System.out.println(items);

        System.out.println(items.isEmpty());

        System.out.println(items.get("Banana"));
        System.out.println(items.get("Avocado"));
        System.out.println(items.get("Orange"));
        System.out.println(items.get("Bread"));

        items.remove("Apple");
        System.out.println(items);

        System.out.println("Avocado is there?" + items.containsKey("Avocado"));
        System.out.println("Apple is there?" + items.containsKey("Apple"));

        items.replace("Orange", 7.90);
        System.out.println("Price of the Oranges: " + items.get("Orange"));

        items.put("Avocado", 8.49);
        System.out.println("Price of the Avocado: " + items.get("Avocado"));

        // Increase the price of the Avocado by 2
        double increasedPrice = items.get("Avocado")+2;
        items.replace("Avocado", increasedPrice);
        System.out.println("Increased price of Avocado is: " + items.get("Avocado"));
    }
}
