package udemy.course.exercise26.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ProgramVotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> map = new HashMap<>();
            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if (map.get(name) == null) {
                    map.put(name, votes);
                } else {
                    map.put(name, votes + map.get(name));
                }
                line = br.readLine();
            }

            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

///home/viviane/Documentos/udemyCourse/file_test/votes.csv