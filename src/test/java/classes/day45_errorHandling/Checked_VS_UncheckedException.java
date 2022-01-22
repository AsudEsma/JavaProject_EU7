package classes.day45_errorHandling;

public class Checked_VS_UncheckedException {
    public static void main(String[] args) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
