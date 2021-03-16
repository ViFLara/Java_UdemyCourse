package udemy.course.exercise18.application;

import udemy.course.exercise18.model.entities.Contract;
import udemy.course.exercise18.model.entities.Installment;
import udemy.course.exercise18.model.services.ContractService;
import udemy.course.exercise18.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println("Installments: ");
        for (Installment it : contract.getInstallments()) {
            System.out.println(it);
        }
        sc.close();
    }
}
