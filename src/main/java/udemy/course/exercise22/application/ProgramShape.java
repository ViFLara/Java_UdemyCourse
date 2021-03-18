package udemy.course.exercise22.application;

import udemy.course.exercise22.entities.Circle;
import udemy.course.exercise22.entities.Rectangle;
import udemy.course.exercise22.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class ProgramShape {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        // List that accepts any subtype of Shape: ( List<? extends Shape> )
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
