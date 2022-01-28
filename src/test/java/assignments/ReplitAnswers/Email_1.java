package assignments.ReplitAnswers;

import java.util.Scanner;

public class Email_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            int underscore = email.indexOf("_");
            int at = email.indexOf("@");
            String firstName = email.substring(0, underscore);
            String lastName = email.substring(underscore + 1, at);
            email = email.substring(at);
            email = lastName + "_" + firstName + email;
            System.out.println(email);
        } else {
            System.out.println(email);
        }
        scan.close();
    }
}
