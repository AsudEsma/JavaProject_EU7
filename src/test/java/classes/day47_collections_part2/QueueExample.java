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

        // poll() and remove() is very similar. Only difference is poll() will return null if the queue is empty
        name = queue.poll();
        System.out.println(name);
        System.out.println(queue);

        // Get the element at the front of the queue without removing it using peek()
        name = queue.peek();
        System.out.println(name);
        System.out.println(queue);

    }
}
