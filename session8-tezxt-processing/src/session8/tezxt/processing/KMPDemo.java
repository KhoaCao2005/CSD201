/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session8.tezxt.processing;

/**
 *
 * @author khoac
 */
public class KMPDemo {

    public static int[] findLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int length = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static int find(String text, String pattern) {
        int[] lps = findLPS(pattern);
        int n = text.length();
        int m = pattern.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = j > 0 ? lps[j - 1] : 0;
                if (j == 0) {
                    i++;
                }
            }

        }
        if (j == m) {
            return i - m;
        }
        return -1;
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
    }
}
