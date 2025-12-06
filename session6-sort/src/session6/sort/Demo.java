/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6.sort;

import java.util.Arrays;

/**
 *
 * @author khoac
 */
public class Demo {
    
    public static void main(String[] args) {
        int a[] = {90, 60, 80, 20, 50, 40, 30, 70};
        Sorter.insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
