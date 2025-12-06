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
public class ArrayStack<T> implements Stack<T> {

    private int capacity;
    private T a[];
    private int t;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.a = (T[]) new Object[this.capacity];
        this.t = -1;
    }

    @Override
    public void push(T e) throws Exception{
        if (this.isFull()) {
            throw new Exception("Stack is full.");
        }
        this.a[++this.t] = e;
    }

    @Override
    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        this.t--;
        return this.a[this.t + 1];
    }

    @Override
    public T top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.a[this.t];
    }

    @Override
    public int size() {
        return this.t + 1;
    }

    @Override
    public boolean isEmpty() {
        return this.t == -1;
    }

    @Override
    public boolean isFull() {
        return this.t == this.capacity - 1;
    }

}
