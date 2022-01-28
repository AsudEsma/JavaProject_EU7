package classes.day46_collections_part1;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<String> v = new Vector<>();
        v.add("water");
        v.add("holy water");
        v.add("coffee");
        v.add("herbal tea");
        v.add("mineral water");
        v.add("espresso");

        for (String str : v) {
            System.out.println(str);
        }

        System.out.println(v.size());
        System.out.println(v.get(5));
    }
}
