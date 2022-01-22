package classes.day45_errorHandling;

public class RimeTimeError {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        System.out.println("Going");
        go();
    }
}
