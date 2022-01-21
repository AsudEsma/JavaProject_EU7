package classes.day44_oopreview.shapes;

import java.util.ArrayList;
import java.util.List;

import static classes.day44_oopreview.shapes.ShapeManager.*;

public class ShapeActions {

    public static void main(String[] args) {

        drawSquare((Square)buildShape("square"));
        drawShape(buildShape("shape"));

        List<Shape> myList = new ArrayList<>();
        myList.add(new Square());
        myList.add(new Diamond());
        myList.add(new Square());
        myList.add(new Shape());
        myList.add(new Shape());

        drawShape(myList);
    }
}
