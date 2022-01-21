package classes.day44_oopreview.shapes;

import classes.day43_polymorphism.Circle;

import java.util.List;

public class ShapeManager {

    public static Shape buildShape(String type) {

        Shape shape = null;

        switch (type.toLowerCase()) {
            case("shape"):
                shape = new Shape();
                break;
            case("square"):
                shape = new Square();
                break;
            case("diamond"):
                shape = new Diamond();
                break;
        }

        return shape;
    }

    // If method does not use any instance variable you can make it static

    public static void drawSquare(Square squareObj) {
        squareObj.draw();
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }

    public static void drawCircle(Circle circle) {
        circle.draw();
    }

    public static void drawShape(List<Shape> shapeList) {
        for(Shape each: shapeList) {
            each.draw();
        }
    }
}
