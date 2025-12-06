/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author khoac
 */
public class JavaListSortDemo {

    public static void main(String[] args) {
        Integer a[] = {90, 60, 80, 20, 50, 40, 30, 70};
        List<Integer> list = Arrays.asList(a);
        list.sort(null);
        System.out.println(list);
//        list.sort((x, y) -> y - x);
//        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
