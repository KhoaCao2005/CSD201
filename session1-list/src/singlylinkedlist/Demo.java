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
public class Demo {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertTail(10);
        list.insertTail(15);
        list.insertTail(20);
        list.insertHead(5);
        list.display();
        list.removeHead();
        list.removeTail();
        list.display();
    }
}
