package udemy.course.exercise4;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dp = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double total_dollars = sc.nextDouble();
        double reais = CurrencyConverter.converter(dp,total_dollars);
        System.out.printf("Amount to be paid in reais = %.2f%n", reais );
        sc.close();
    }
}
