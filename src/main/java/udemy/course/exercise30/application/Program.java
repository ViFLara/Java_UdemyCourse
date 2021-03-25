package udemy.course.exercise30.application;

import udemy.course.exercise30.entities.Product;
import udemy.course.exercise30.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        // Interface implementation :
        // Stream : A sequence of elements supporting sequential and parallel aggregate operations.
        // map : Apply the function to each element of the list and works only for stream.
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //names.forEach(System.out :: println);

        // Reference method with static method :
        //List<String> names = list.stream().map(Product :: staticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out :: println);


        // Reference method with non-static method :
        //List<String> names = list.stream().map(Product :: nonStaticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out :: println);

        // Declared lambda expression :
       /* Function<Product, String> func = product -> product.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());
        names.forEach(System.out :: println);*/

        // Declared lambda inline :
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out :: println);
    }
}
