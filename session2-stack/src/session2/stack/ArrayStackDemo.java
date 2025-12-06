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
public class ArrayStackDemo {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new ArrayStack<>(5);
        stack.push(10);
        stack.push(5);
        stack.push(30);
        stack.push(25);
        stack.push(15);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
