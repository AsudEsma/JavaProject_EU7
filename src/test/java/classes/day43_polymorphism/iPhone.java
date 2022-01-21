package classes.day43_polymorphism;

public class iPhone extends AppleDevice {
    @Override
    public void use() {
        System.out.println("iPhone | Call | Text | Use Social Media");
    }

    public void text() {
        System.out.println("Texting with iPhone...");
    }
}
