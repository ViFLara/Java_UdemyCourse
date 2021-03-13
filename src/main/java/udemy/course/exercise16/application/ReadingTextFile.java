package udemy.course.exercise16.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingTextFile {
    public static void main(String[] args) {

        File file = new File("/home/viviane/Documentos/udemyCourse/file_test/test2.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
