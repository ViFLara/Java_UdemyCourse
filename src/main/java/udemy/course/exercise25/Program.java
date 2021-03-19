package udemy.course.exercise25;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        int number_a = 0;
        int number_b = 0;
        int number_c = 0;

        System.out.print("How many students for course A? ");
        int studentsA = sc.nextInt();
        for (int i = 0; i < studentsA; i++) {
            number_a = sc.nextInt();
            a.add(number_a);
        }
        System.out.print("How many students for course B? ");
        int studentsB = sc.nextInt();
        for (int i = 0; i < studentsB; i++) {
            number_b = sc.nextInt();
            b.add(number_b);
        }
        System.out.print("How many students for course C? ");
        int studentsC = sc.nextInt();
        for (int i = 0; i < studentsC; i++) {
            number_c = sc.nextInt();
            c.add(number_c);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
        sc.close();
    }
}
