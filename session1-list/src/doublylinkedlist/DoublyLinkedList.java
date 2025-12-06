/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author khoac
 */
public class DoublyLinkedList<T> {

    Node<T> head, tail;
    int n;

    public DoublyLinkedList() {
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
            this.head.prev = p;
            p.next = head;
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
            p.prev = this.tail;
            this.tail = p;
        }
        this.n++;
    }

    public void removeHead() {
        if (this.isEmpty()) {
            return;
        }

        if (this.n == 1) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.prev = null;
        }
        this.n--;
    }

    public void removeTail() {
        if (this.isEmpty()) {
            return;
        }

        if (this.n == 1) {
            this.head = this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }
        this.n--;
    }

    public void insert(Node<T> p, T data) {

        Node<T> newNode = new Node<>(data);
        newNode.prev = p;
        newNode.next = p.next;

        if (p.next != null) {
            p.next.prev = newNode;
        } else {
            this.tail = newNode;
        }

        p.next = newNode;
        this.n++;
    }

    public void remove(Node<T> p) {

        if (p == this.head) {
            this.removeHead();
            return;
        }

        if (p == this.tail) {
            this.removeTail();
            return;
        }

        if (p.prev != null) {
            p.prev.next = p.next;
        }

        if (p.next != null) {
            p.next.prev = p.prev;
        }

        this.n--;
    }

    public void displayForward() {
        Node<T> p = this.head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node<T> p = this.tail;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.prev;
        }
        System.out.println();
    }
}
