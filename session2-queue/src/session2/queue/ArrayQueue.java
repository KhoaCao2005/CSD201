/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.queue;

/**
 *
 * @author khoac
 */
public class ArrayQueue<E> implements Queue<E> {

    private int N;
    private E a[];
    private int f, sz;

    public ArrayQueue(int N) {
        this.N = N;
        this.a = (E[]) new Object[N];
        this.f = 0;
        this.sz = 0;
    }

    @Override
    public int size() {
        return this.sz;
    }

    @Override
    public boolean isEmpty() {
        return this.sz == 0;
    }

    @Override
    public void enqueue(E e) throws Exception {
        if (this.sz == this.N) {
            throw new Exception("Queue is full!");
        }
        int r = (this.f + this.sz) % this.N;
        this.a[r] = e;
        this.sz++;
    }

    @Override
    public E first() {
        if (this.isEmpty()) {
            return null;
        }
        return this.a[this.f];
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        E temp = this.a[this.f];
        this.f = (this.f + 1) % this.N;
        this.sz--;
        return temp;
    }

}
