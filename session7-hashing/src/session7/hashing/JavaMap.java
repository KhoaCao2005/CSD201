/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author khoac
 */
public class JavaMap {

    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(1, "Nam", 9.5));
        map.put(2, new Student(2, "Kiet", 8.5));
        map.put(3, new Student(3, "Chinh", 0.5));
        map.put(4, new Student(4, "Trung", 5.5));
        map.put(5, new Student(5, "Thanh", 7.5));
        System.out.println("Serach a student by id: ");
        System.out.println(map.get(1));
        System.out.println("Student list: ");
        for (Student s : map.values()) {
            System.out.println(s);
        }
    }
}
