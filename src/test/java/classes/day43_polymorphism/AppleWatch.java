package classes.day43_polymorphism;

public class AppleWatch extends AppleDevice {

    @Override
    public void use() {
        System.out.println("AppleWatch | Wear | Train | Breath");
    }

    public void train() {
        System.out.println("Training with AppleWatch...");
    }
}
