/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author khoac
 */
public class WordCount {

    public static Map<String, Integer> count(String s) {
        String[] words = s.toLowerCase().replaceAll("[^a-zA-ZÀ-ỹ0-9 ]", "").split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "hajimemashite, watashi no namae wa Khoa desu!";
        Map<String, Integer> map = count(s);
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(String.format("%s:%d", entry.getKey(), entry.getValue()));
        }
    }
}
