package udemy.course.exercise20.application;

import udemy.course.exercise20.services.BrazilInterestService;
import udemy.course.exercise20.services.InterestService;
import udemy.course.exercise20.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        //InterestService interestService = new UsaInterestService(1.0);
        //double pay = interestService.payment(amount, months);

        System.out.println("Payment after " + months + "months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();


    }
}
