/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author khoac
 */
public class JavaHashSet {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(20);
        for (Integer x : s) {
            System.out.println(x);
        }
    }
}
