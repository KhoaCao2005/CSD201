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
public interface Stack<T> {
    void push(T e) throws Exception;
    T pop();
    T top();
    int size();
    boolean isEmpty();
    boolean isFull();
}
