package udemy.course.exercise3;

import java.util.Locale;
import java.util.Scanner;

public class GradeProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Grade gd = new Grade();
        gd.name = sc.nextLine();
        gd.grade1 = sc.nextDouble();
        gd.grade2 = sc.nextDouble();
        gd.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f POINTS%n", gd.finalGrade());
         if (gd.finalGrade() < 60.0) {
             System.out.println("FAILED");
             System.out.printf("MISSING %.2f POINTS%n", gd.missingPoints());
         } else {
             System.out.println("PASS");
         }
         sc.close();





        sc.close();

    }
}
