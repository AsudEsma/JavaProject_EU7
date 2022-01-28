package assignments.ReplitAnswers;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = 0;
        long total = 1;

        while (factorial < n) {
            for (int i = 1; i <= n; i++) {
                factorial++;
                total *= factorial;
            }

            System.out.println(total);
            scan.close();
        }

    }

}
