package udemy.course.exercise28.application;

import udemy.course.exercise28.entities.Product;
import udemy.course.exercise28.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));

        // Interface implementation :
        //list.removeIf(new ProductPredicate());

        // Reference method with static method :
        //list.removeIf(Product :: staticProductPredicate);

        // Reference method with non-static method :
        //list.removeIf(Product :: nonStaticProductPredicate);

        // Declared lambda expression :
       /* double min = 100.0;
        Predicate<Product> pred = product -> product.getPrice() >= min;
        list.removeIf(pred);*/

        // Declared lambda inline :
        list.removeIf(product -> product.getPrice() >= 100.0);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
