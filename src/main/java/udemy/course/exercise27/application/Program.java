package udemy.course.exercise27.application;

import udemy.course.exercise27.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Anonymous function implementation between braces
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //list.sort(new MyComparator());
        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}