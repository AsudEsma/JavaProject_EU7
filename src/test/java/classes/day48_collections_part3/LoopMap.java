package classes.day48_collections_part3;

import java.util.HashMap;
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

        for(String key : dataMap.keySet()) {
            System.out.println(key);
        }
    }
}
