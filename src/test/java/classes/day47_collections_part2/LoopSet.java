package classes.day47_collections_part2;

import java.util.*;

public class LoopSet {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
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
            System.out.print(each+"|");
        }

        System.out.println();

        // Looping with LAMBDA expression
        nums.forEach(n -> System.out.print(n + "|"));
    }
}
