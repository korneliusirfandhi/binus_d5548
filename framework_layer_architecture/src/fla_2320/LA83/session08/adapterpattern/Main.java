package fla_2320.LA83.session08.adapterpattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RectInterface rectangle = new Rectangle(20, 10);
        TriInterface triangle = new Triangle(20, 10);

        // adapter pattern sample usage
        RectInterface adapter = new Adapter(triangle);

        List<RectInterface> rectangleObjects = new ArrayList<RectInterface>();
        rectangleObjects.add(rectangle);
        rectangleObjects.add(adapter);

        System.out.println("Processing the following objects:\n");
        for (RectInterface rectObject : rectangleObjects) {
            System.out.println("Area: " + getDetails(rectObject) + " square units.\n");
        }
    }

    /*
     * The following method does not
     * know whether it gets a rectangle,
     * or a triangle through the adapter.
     */
    private static double getDetails(RectInterface rectangle) {
        rectangle.aboutMe();
        return rectangle.calculateArea();
    }

}
