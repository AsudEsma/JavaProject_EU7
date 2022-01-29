package classes.day47_collections_part2;

import java.util.*;

public class LoopArrayList_LAMBDA {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(55);
        nums.add(103);
        nums.add(46);
        nums.add(98);
        nums.add(86);
        nums.add(103);
        nums.add(101);
        nums.add(111);
        nums.add(98);
        nums.add(55);
        nums.add(46);

        System.out.println("nums.size() = " + nums.size());

        // Looping with for each loop
        for (Integer each : nums) {
            System.out.print(each + "|");
        }

        System.out.println();

        // Looping with for iterator loop
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + "|");
        }

        System.out.println();

        // Looping with LAMBDA expression
        nums.forEach(n -> System.out.print(n+"|"));

        System.out.println();

        nums.removeIf(n -> n<100);
        nums.forEach(n-> System.out.print(n + "|"));
    }
}
