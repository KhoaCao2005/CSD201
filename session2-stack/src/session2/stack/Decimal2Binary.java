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
public class Decimal2Binary {
    public static String toBinary(int s) throws Exception{
        Stack<Integer> stack = new ArrayStack<>(s);
        while(s>0){
            stack.push(s%2);
            s/=2;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        System.out.println(toBinary(12345));
    }
}
