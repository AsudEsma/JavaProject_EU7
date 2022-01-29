package classes.day47_collections_part2;

import java.util.*;

public class LoopWtihIterator {
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

        // Create Iterator object
        Iterator<Integer> it = nums.iterator();

        // Call hasNext method
        // hasNext returns true if there is still a next value
        // returns false when it reaches the end or it is empty
        System.out.println("it.hasNext() = " + it.hasNext());
        System.out.println("it.next() = " + it.next());
        System.out.println("it.next() = " + it.next());
        System.out.println("it.next() = " + it.next());
        System.out.println("it.next() = " + it.next());
        System.out.println("it.next() = " + it.next());

        System.out.println("******************");

        while(it.hasNext()) {
            System.out.print(it.next() + "|");
        }
    }
}
