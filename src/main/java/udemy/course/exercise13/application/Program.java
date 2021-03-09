package udemy.course.exercise13.application;

import udemy.course.exercise13.entities.Company;
import udemy.course.exercise13.entities.Individual;
import udemy.course.exercise13.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int payers = sc.nextInt();

        for (int i = 0; i < payers; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                TaxPayer individual = new Individual(name, anualIncome, health);
                list.add(individual);
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmp = sc.nextInt();
                TaxPayer company = new Company(name,anualIncome, numberEmp);
                list.add(company);
            }
        }

        double sum = 0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxP : list) {
            double tax = taxP.tax();
            System.out.println(taxP.getName()
                    + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
