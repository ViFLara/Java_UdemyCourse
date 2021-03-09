package udemy.course.exercise12.application;

import udemy.course.exercise12.entities.ImportedProduct;
import udemy.course.exercise12.entities.Product;
import udemy.course.exercise12.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'c') {
                Product product2 = new Product(name, price);
                list.add(product2);
            } else if (ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product product3 = new UsedProduct(name, price, manufactureDate);
                list.add(product3);
            } else {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Product product1 = new ImportedProduct(name, price, fee);
                list.add(product1);

            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
