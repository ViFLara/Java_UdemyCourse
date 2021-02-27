package udemy.course.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle width and height: ");

        Rectangle rectangle = new Rectangle();
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = " + String.format("% .2f", rectangle.area()));
        System.out.println("PERIMETER = " + String.format("% .2f", rectangle.perimeter()));
        System.out.println("DIAGONAL = " + String.format("% .2f", rectangle.diagonal()));

        sc.close();
    }
}
