package udemy.course.exercise16.application;

import java.io.File;
import java.util.Scanner;

public class FilePath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        System.out.println("Get name: " + path.getName());
        System.out.println("Get parent: " + path.getParent());
        sc.close();
    }
}
