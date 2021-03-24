package udemy.course.exercise29.application;

import udemy.course.exercise29.entities.Product;
import udemy.course.exercise29.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        // Interface implementation :
        //list.forEach(new PriceUpdate());
        //list.forEach(System.out :: println);

        // Reference method with static method :
        //list.forEach(Product :: staticPriceUpdate);
        //list.forEach(System.out :: println);

        // Reference method with non-static method :
        //list.forEach(Product :: nonStaticPriceUpdate);
        //list.forEach(System.out :: println);

        // Declared lambda expression :
       /* double factor = 1.1;
        Consumer<Product> cons = product -> {
            product.setPrice(product.getPrice() * factor);
        };
        list.forEach(cons);
        list.forEach(System.out :: println);*/

        // Declared lambda inline :
        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));
        list.forEach(System.out :: println);
    }
}
