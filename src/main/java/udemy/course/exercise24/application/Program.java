package udemy.course.exercise24.application;

import com.sun.source.tree.Tree;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        //Set<Integer> set = new TreeSet<>();
        //set.add(5);
        //set.add(1);
        //set.add(3);

        Set<String> set = new TreeSet<>();
        set.add("tv");
        set.add("tablet");
        set.add("notebook");

        //set.removeIf(x -> x.length() >= 2);
        //set.removeIf(x -> x.charAt(0) == 't');
        set.removeIf(x -> x.endsWith("t"));

        for (String i : set) {
            System.out.println(i);
        }
    }
}
