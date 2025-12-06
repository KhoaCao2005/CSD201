/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.heap;

/**
 *
 * @author khoac
 */
public class MaxHeap {

    private int capacity;
    private int a[];
    private int size;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.a = new int[capacity];
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * i + 2;
    }

    public boolean isLeaf(int i) {
        if (i >= (size / 2) && i < size) {
            return true;
        }
        return false;
    }

    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void insert(int element) {
        if (this.isFull()) {
            System.out.println("Heap is full.");
            return;
        }
        a[size] = element;
        int current = size;
        while (a[current] > a[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int key = a[0];
        size--;
        a[0] = a[size];
        int pos = 0;
        while ((left(pos) <= this.size && a[pos] < a[left(pos)])
                || (right(pos) <= this.size && a[pos] < a[right(pos)])) {
            if (a[left(pos)] > a[right(pos)]) {
                swap(pos, left(pos));
                pos = left(pos);
            } else {
                swap(pos, right(pos));
                pos = right(pos);
            }
        }
        return key;
    }

    public void draw() {
        draw_NRL(0, "", "");
    }

    public void draw_NRL(int pos, String prefix, String childrenPrefix) {
        if (pos >= size) {
            return;
        }
        System.out.println(prefix + a[pos]);
        draw_NRL(right(pos), childrenPrefix + "R-- ", childrenPrefix + "|   ");
        draw_NRL(left(pos), childrenPrefix + "L-- ", childrenPrefix + "    ");
    }

    public void insert(int... keys) {
        for (int key : keys) {
            this.insert(key);
        }
    }
}
