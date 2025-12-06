/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session1.list;

/**
 *
 * @author khoac
 */
public class ArrayList<T> implements IList<T> {

    private int capacity;//so phan tu toi da cua danh sach
    private int n;//so phan tu cua danh sach
    private T a[];//chua du lieu cua danh sach

    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.a = (T[]) new Object[this.capacity];
        this.n = 0;
    }

    @Override
    public int size() {
        return this.n;
    }

    @Override
    public boolean isEmpty() {
        return this.n == 0;
    }

    @Override
    public boolean isFull() {
        return this.n == this.capacity;
    }

    @Override
    public T first() {
        return this.isEmpty() ? null : this.a[0];
    }

    @Override
    public T last() {
        return this.isEmpty() ? null : this.a[this.n - 1];
    }

    @Override
    public boolean addFirst(T e) {
        return this.insert(0, e);
    }

    @Override
    public boolean addLast(T e) {
        return this.insert(this.n, e);
    }

    @Override
    public T removeFirst() {
        return this.remove(0);
    }

    @Override
    public T removeLast() {
        return this.remove(this.n - 1);
    }

    @Override
    public boolean insert(int i, T e) {
        if (i < 0 || i > this.n || this.isFull()) {
            return false;
        }
        for (int j = this.n; j > i; j--) {
            this.a[j] = this.a[j - 1];
        }
        this.a[i] = e;
        this.n++;
        return true;
    }

    @Override
    public T remove(int i) {
        if (i < 0 || i >= this.n || this.isEmpty()) {
            return null;
        }
        T temp = this.a[i];
        for (int j = i; j < this.n - 1; j++) {
            this.a[j] = this.a[j + 1];
        }
        this.n--;
        return temp;
    }

    @Override
    public T get(int i) {
        if (this.isEmpty() || i < 0 || i >= this.n) {
            return null;
        }
        return this.a[i];
    }

}
