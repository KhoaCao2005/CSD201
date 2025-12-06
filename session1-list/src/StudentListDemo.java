
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khoac
 */
public class StudentListDemo {
    
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Nam", 9.5));
        list.add(new Student(2, "Hai", 7.5));
        list.add(new Student(3, "Chien", 8.5));
        list.add(new Student(4, "Minh", 9.5));
        list.add(new Student(5, "Trieu", 5.5));
        list.forEach(System.out::println);
        
        System.out.println("After sorting by score...");
        Collections.sort(list, (s1, s2) -> Double.compare(s1.score, s2.score));
        list.forEach(System.out::println);
        
        System.out.println("After sorting by name...");
        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
        list.forEach(System.out::println);
    }
}
