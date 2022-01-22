package classes.day45_errorHandling;

public class Throw_Throws {
    public static void main(String[] args) {

        System.out.println("Hello world");

//      throw new RuntimeException("This is some exception");

        try {
            throw new Exception("Here is another exception"); // checked exception
        } catch (Exception e) {
            e.printStackTrace();
        }

        String username = "";
        if (username.isEmpty()) {
            throw new RuntimeException("User name can not be empty");
        } else {
            System.out.println("Valid username");
        }
    }
}
