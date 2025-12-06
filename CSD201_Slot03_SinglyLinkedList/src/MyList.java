
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khoac
 */
public class MyList {

    Node head;

    public MyList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void clear() {
        this.head = null;
    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info);
            System.out.println(" ");
            p = p.next;
        }
    }

    void loadData(int k) {
        Random gnt = new Random();
        for (int i = 0; i < k; i++) {
            int number = gnt.nextInt(1000) + 1;
            addFirst(number);
        }
    }

    public void addFirst(int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    void f1() {
        System.out.println("Linked List: ");
        this.traverse();
    }

    void f2() {
        System.out.println("Before: ");
        this.traverse();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int num = sc.nextInt();
        addLast(num);

        System.out.println("After: ");
        this.traverse();
    }

    void f3() {
        System.out.println("Before: ");
        this.traverse();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int num = sc.nextInt();

        System.out.println("Input position: ");
        int k = sc.nextInt();

        if (k == 0) {
            addFirst(num);
            return;
        }

        Node current = head;
        int currentIndex = 0;
        while (currentIndex < k - 1 && current != null) {
            current = current.next;
            currentIndex++;
        }

        Node newNode = new Node(num);
        newNode.next = current.next;
        current.next = newNode;
        System.out.println("After: ");
        this.traverse();
    }

    void f4() {
        System.out.println("Before: ");
        this.traverse();

        Node newNode = new Node();
        if (head != null) {
            head = head.next;
        }

        System.out.println("After: ");
        this.traverse();
    }

    void f5() {
        System.out.println("Before: ");
        this.traverse();

        Node newNode = new Node();
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node secondLast = head;
                while (secondLast.next.next != null) {
                    secondLast = secondLast.next;
                }
                secondLast.next = null;
            }
        }

        System.out.println("After: ");
        this.traverse();
    }
}
