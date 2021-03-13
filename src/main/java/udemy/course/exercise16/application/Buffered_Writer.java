package udemy.course.exercise16.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good Night"};

        String path = "/home/viviane/Documentos/udemyCourse/file_test/test3.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
