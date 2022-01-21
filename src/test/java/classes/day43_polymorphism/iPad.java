package classes.day43_polymorphism;

public class iPad extends AppleDevice {

    @Override
    public void use() {
        System.out.println("iPad | Read books | Draw");
    }

    public void draw() {
        System.out.println("Drawing shapes with iPad...");
    }
}
