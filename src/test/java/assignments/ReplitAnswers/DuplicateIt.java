package assignments.ReplitAnswers;

import java.util.Scanner;

public class DuplicateIt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        System.out.println(word1.concat(word2).concat(word2).concat(word1));
        scan.close();

    }
}