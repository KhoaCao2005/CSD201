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
public class Demo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insertTail(10);
        list.insertTail(15);
        list.insertTail(20);
        list.insertHead(5);
        list.displayForward();
        list.displayBackward();
        list.removeHead();
        list.removeTail();
        list.displayForward();
        Node<Integer> p = list.head;
        list.insert(p, 25);
        list.displayForward();
        list.remove(p);
        list.displayForward();
    }
}
