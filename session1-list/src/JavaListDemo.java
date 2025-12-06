
import java.util.ArrayList;
import java.util.Collection;
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
public class JavaListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(80);
        list.add(50);
        list.add(70);
        /*for(int i:list){
            System.out.println(i);
        }*/
        //list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);
        System.out.println("After sorting...");
        Collections.sort(list);
        list.forEach(System.out::println);
        
        System.out.println("After reversing...");
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
