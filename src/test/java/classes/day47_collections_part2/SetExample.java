package classes.day47_collections_part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(100);
        mySet.add(500);
        mySet.add(100);
        mySet.add(250);
        mySet.add(300);
        mySet.add(900);
        mySet.add(100);
        mySet.add(900);
        mySet.add(500);
        mySet.add(60);
        mySet.add(80);

        System.out.println(mySet);
        System.out.println(mySet.size());

        List<String> list = Arrays.asList("23", "23", "a", "a", "bb", "jj", "q", "t", "t", "asu", "asu", "asu");

        Set<String> uniqueList = new HashSet<>(list);
        System.out.println("list = " + list);
        System.out.println("uniqueList = " + uniqueList);
        System.out.println("list.size() = " + list.size());
        System.out.println("uniqueList.size() = " + uniqueList.size());

    }
}
