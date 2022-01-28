package assignments.ReplitAnswers;

import java.util.Scanner;

public class EqualJavaPython {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        scan.close();

        int counterJ = 0;
        int counterP = 0;
        for (int i = 0; i < sentence.length() - 3; i++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                counterJ++;
            }
        }
        for (int i = 0; i < sentence.length() - 5; i++) {
            if (sentence.substring(i, i + 6).equals("python")) {
                counterP++;
            }
        }

        if (counterJ == counterP) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
