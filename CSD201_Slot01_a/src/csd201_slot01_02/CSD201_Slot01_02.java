/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd201_slot01_02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khoac
 */
public class CSD201_Slot01_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();

//        for (int i = 0; i < 100; i++) {
//            list1.add(i);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(list1.get(i));
//        }
//
//        list1.remove(0);
//        list1.remove(list1.size() - 1);
//
//        System.out.println("======");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(list1.get(i));
//        }
//
//        System.out.println("======");
//        System.out.println(list1.size());
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("======");
        list1.add(0, 5);
        list1.add(list1.size(), 90);
        for (int i = 0; i < 12; i++) {
            System.out.println(list1.get(i));
        }
    }

}
