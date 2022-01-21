package classes.day43_polymorphism;

public class Mac extends AppleDevice {

    @Override
    public void use() {
        System.out.println("Mac | Code | Play");
    }

    public void code() {
        System.out.println("Coding with Mac...");
    }
}
