package udemy.course.exercise23.application;

import udemy.course.exercise23.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "alex@gmail.com");

        String s1 = "test";
        String s2 = "test";

        String s3 = new String("test");
        String s4 = new String("test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);


    }
}
