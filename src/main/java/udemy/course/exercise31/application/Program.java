package udemy.course.exercise31.application;

import udemy.course.exercise31.entities.Product;
import udemy.course.exercise31.modelservices.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        ProductService ps = new ProductService();

        //double sum = ps.filteredSum(list);
        //double sum = ps.filteredSum(list, product -> product.getName().charAt(0) == 'T');
        double sum = ps.filteredSum(list, product -> product.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
