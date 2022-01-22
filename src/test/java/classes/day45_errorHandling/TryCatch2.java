package classes.day45_errorHandling;

public class TryCatch2 {
    public static void main(String[] args) {

        int[] nums = {36,6,34,12};
 //     System.out.println(nums{0]);    // compiler error

        try {
            System.out.println(nums[6]);
        } catch (Exception e) {
            System.out.println("Wrong index");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            int j=100;
            int n=j/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
