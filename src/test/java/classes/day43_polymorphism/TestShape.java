package classes.day43_polymorphism;

public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Shape();
        s1.draw();

        s1 = new Circle();
        s1.draw();

        s1 = new Shape();
        s1.draw();

        s1 = new Triangle();
        s1.draw();

    }
}
