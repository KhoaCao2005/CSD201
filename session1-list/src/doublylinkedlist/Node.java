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
public class Node<T> {

    T data;
    Node<T> prev, next;

    public Node(T data) {
        this.data = data;
        this.prev = this.next = null;
    }

}
