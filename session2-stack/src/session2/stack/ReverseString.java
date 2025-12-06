/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.stack;

/**
 *
 * @author khoac
 */
public class ReverseString {

    public static String reverse(String s) throws Exception {
        Stack<Character> stack = new ArrayStack<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String s1 = "Hello";
        String s2 = reverse(s1);
        System.out.println(s2);
    }
}
