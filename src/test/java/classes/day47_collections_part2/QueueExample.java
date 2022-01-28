package classes.day47_collections_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Mike");
        queue.add("Ozzy");
        queue.add("Jamal");
        queue.add("Asiya");

        System.out.println(queue);

        String name = queue.remove();
        System.out.println(name);
        System.out.println(queue);

        name = queue.poll();
        System.out.println(name);
        System.out.println(queue);
    }
}
