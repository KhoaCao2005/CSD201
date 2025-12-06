/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.stack;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author khoac
 */
public class LinkedListStack<T> implements Stack<T> {

    private List<T> list;

    public LinkedListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public void push(T e) throws Exception {
        this.list.add(0, e);
    }

    @Override
    public T pop() {
        return this.list.remove(0);
    }

    @Override
    public T top() {
        return this.list.get(0);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

}
