/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khoac
 */
public class MyQueue {

    Node head, tail;

    public MyQueue() {
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void enqueue(String id, String name, int age, double gpa) {
        Node newNode = new Node(new Student(id, name, age, gpa));
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public Student dequeue() {
        if (!isEmpty()) {
            Student value = head.info;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return value;
        } else {
            return null;
        }
    }

    public Student front() {
        if (!isEmpty()) {
            Student value = head.info;
            return value;
        } else {
            return null;
        }
    }

    public void display() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.info);
            tmp = tmp.next;
        }
    }

    void findMaxGpa() {
        Node current = head;
        double maxGpa = current.info.getGpa();
        while (current != null) {
            if (current.info.getGpa() > maxGpa) {
                maxGpa = current.info.getGpa();
            }
            current = current.next;
        }
        System.out.println(maxGpa);
    }
}
