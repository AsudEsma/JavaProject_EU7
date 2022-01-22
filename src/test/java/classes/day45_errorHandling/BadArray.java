package classes.day45_errorHandling;

public class BadArray {
    public static void main(String[] args) {

        int[] num = {1,2,3};
        for (int i = 0; i <= num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("Learning exceptions");
    }
}
