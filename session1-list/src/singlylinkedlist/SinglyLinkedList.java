/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author khoac
 */
public class SinglyLinkedList<T> {

    Node<T> head, tail;
    int n;

    public SinglyLinkedList() {
        this.head = this.tail = null;
        this.n = 0;
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public void insertHead(T data) {
        Node<T> p = new Node<>(data);
        if (this.isEmpty()) {
            this.head = this.tail = p;
        } else {
            p.next = this.head;
            this.head = p;
        }
        this.n++;
    }

    public void insertTail(T data) {
        Node<T> p = new Node<>(data);
        if (this.isEmpty()) {
            this.head = this.tail = p;
        } else {
            this.tail.next = p;
            this.tail = p;
        }
        this.n++;
    }

    public void removeHead() {
        if (!isEmpty()) {
            this.head = this.head.next;
            this.n--;
        }
    }

    public void removeTail() {
        if (!isEmpty()) {
            if (this.n == 1) {
                this.head = this.tail = null;
            } else {
                Node<T> p = this.head;
                while (p.next != this.tail) {
                    p = p.next;
                }
                p.next = null;
                this.tail = p;
            }
            this.n--;
        }
    }

    public void display() {
        Node<T> p = this.head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
}
