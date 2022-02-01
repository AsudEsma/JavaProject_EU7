package classes.day48_collections_part3;

import classes.day46_collections_part1.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {
        Map<String, String> dataMap = new HashMap<>();

        dataMap.put("url", "qa3.vytrack.com");
        dataMap.put("username", "user66");
        dataMap.put("password", "abc66");
        dataMap.put("browser", "chrome");
        dataMap.put("truckdriver", "Bob");
        dataMap.put("storemanager", "John");

        // keySet --> returns set with all the keys in the map
        // values --> returns with all the values in the map

        System.out.println("****KEYS ONLY****");
        for(String key : dataMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("****VALUES ONLY****");
        for (String value : dataMap.values()) {
            System.out.println(value);
        }

        System.out.println("****KEY | VALUE****");
        for (String key : dataMap.keySet()) {
            System.out.println(key + " | " + dataMap.get(key));
        }

        // LAMBDA:
        System.out.println("****KEY | VALUE****");
        System.out.println("***** w/LAMBDA ****");
        dataMap.forEach((k,v) -> System.out.println(k + " | " + v));

        Map<Integer, Product> studentMap = new HashMap<>();
        Map<String, String[]> data1 = new HashMap<>();
        Map<Integer, List<String>> data2 = new HashMap<>();
        Map<Integer, List<String[]>> data3 = new HashMap<>();
        Map<String, Map<Integer, Integer>> data4 = new HashMap<>();
        Map<String, Map<Integer, Product>> data5 = new HashMap<>();
    }
}
