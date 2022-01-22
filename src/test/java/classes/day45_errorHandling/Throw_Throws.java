package classes.day45_errorHandling;

public class Throw_Throws {
    public static void main(String[] args) throws InterruptedException {

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

        sleep3(3);
    }

    public static void sleep(int secs) throws InterruptedException {
        Thread.sleep(secs*1000);
    }

    public static void sleep2(int secs) throws InterruptedException {
        sleep(secs);
    }

    public static void sleep3(int secs) throws InterruptedException {
        sleep2(secs);
    }
}
