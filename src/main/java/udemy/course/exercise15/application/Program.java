package udemy.course.exercise15.application;

import udemy.course.exercise14.model.exception.DomainException;
import udemy.course.exercise15.model.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit:  ");
            double withdrawLimit = sc.nextDouble();
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            try {
            account.withdraw(amount);
            System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch (DomainException exception) {
            System.out.println("Withdraw error:  " + exception.getMessage());
        }
        sc.close();
    }
}
