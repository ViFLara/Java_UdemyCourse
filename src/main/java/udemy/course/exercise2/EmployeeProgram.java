package udemy.course.exercise2;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();
        System.out.printf("Name: %s%n", employee.name);
        System.out.print("Gross salary: " + String.format("%.2f", employee.grossSalary));
        System.out.println();
        System.out.print("Tax: " + String.format("%.2f", employee.tax));
        System.out.println();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println();

        System.out.print("Updated data: " + employee);
        sc.close();
    }
}
