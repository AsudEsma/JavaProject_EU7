package classes.day47_collections_part2;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> numsStack = new Stack<>();
        numsStack.add(50);
        numsStack.add(70);
        numsStack.add(100);
        numsStack.add(500);
        numsStack.add(4);

        System.out.println(numsStack);

        // Check the value on the top of stack
        System.out.println(numsStack.peek());

        // Read the value on the top of stack then remove it
        numsStack.pop();
        System.out.println(numsStack);
        System.out.println(numsStack.get(0));
    }
}
