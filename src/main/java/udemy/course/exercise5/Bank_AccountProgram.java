package udemy.course.exercise5;

import java.util.Locale;
import java.util.Scanner;

public class Bank_AccountProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank_Account account;

        System.out.println(" Enter account number: ");
        int number = sc.nextInt();
        System.out.println(" Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println(" Is there a initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial value: ");
            double initialDeposit = sc.nextDouble();
            account = new Bank_Account(number, holder, initialDeposit);
        } else {
            account = new Bank_Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);


        sc.close();
    }
}
