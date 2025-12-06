/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8.tezxt.processing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author khoac
 */
public class NaiveAlgorithmDemo {

    public static int find(String s, String p) {
        for (int i = 0; i <= s.length() - p.length(); i++) {
            int j;
            for (j = 0; j < p.length(); j++) {
                if (s.charAt(i + j) != p.charAt(j)) {
                    break;
                }
            }
            if (j == p.length()) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findAll(String s, String p) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            int j;
            for (j = 0; j < p.length(); j++) {
                if (s.charAt(i + j) != p.charAt(j)) {
                    break;
                }
            }
            if (j == p.length()) {
                list.add(i);
            }
        }
        int[] indices = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            indices[i] = list.get(i);
        }
        return indices;
    }

    public static String replace(String s, String p1, String p2) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i <= s.length() - p1.length(); i++) {
            int j;
            for (j = 0; j < p1.length(); j++) {
                if (s.charAt(i + j) != p1.charAt(j)) {
                    break;
                }
            }
            if (j == p1.length()) {
                sb.delete(i, i + p1.length());
                sb.insert(i, p2);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "qwertyuiopasdf";
        String p = "qwert";
        int index = find(s, p);
        if (index == 1) {
            System.out.println("Not found");
        } else {
            System.out.println(String.format("Found %s at %d", p, index));
        }
        s = "abcd abce abcf";
        p = "abc";
        int indices[] = findAll(s, p);
        System.out.println(Arrays.toString(indices));
        System.out.println(replace(s, "abc", "xxx"));
    }
}
