package classes.day44_oopreview.shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Object shape = new Shape();
        Shape diamond = new Diamond();
        Shape square = new Square();

        ( (Shape) shape).draw();

        square.draw();
        diamond.draw();

        ( (Square) square).squareMethod();

    }
}
