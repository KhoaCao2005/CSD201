/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6.sort;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author khoac
 */
public class StudentListSortDemo {
    
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Nam", 9.5),
                new Student(5, "Hai", 7.5),
                new Student(4, "Kieu", 8.5),
                new Student(3, "Dai", 6.5),
                new Student(2, "Tuan", 9.5)
        );
        list.sort((s1, s2) -> Double.compare(s1.score, s2.score));
        list.forEach(s -> System.out.println(s));
        System.out.println("========");
        list.sort((s1, s2) -> s1.name.compareTo(s2.name));
        list.forEach(s -> System.out.println(s));
    }
}
