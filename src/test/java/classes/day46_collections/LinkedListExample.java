package classes.day46_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(50);
        list.add(600);
        list.add(1000);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println(( (LinkedList) list).getFirst());
        ((LinkedList) list).addFirst(1);
        ((LinkedList) list).addLast(9999);


    }
}
