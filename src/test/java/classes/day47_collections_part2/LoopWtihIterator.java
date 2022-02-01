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

        System.out.println();

//      System.out.println("it.next() = " + it.next());
        // No more elements to print out

        Iterator<Integer> it2 = nums.iterator();
        /**
         * The difference between iterator and for each loop is:
         * We can remove objects while looping with iterator
         */

        while (it2.hasNext()) {
            int val = it2.next();
            if(val>60) {
                it2.remove();
            }
        }
        System.out.println(nums);

        List<String> cities = new ArrayList<>();
        cities.add("Boston");
        cities.add("New York");
        cities.add("Washington DC");
        cities.add("Virginia");
        cities.add("California");
        cities.add("Texas");
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Boston");

        for (String city : cities) {
            if(city.equals("Boston")) {
                cities.remove(city);
            }
        }

        // We got **ConcurrentModificationException**
    }
}
