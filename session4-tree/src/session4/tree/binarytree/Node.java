/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.binarytree;

/**
 *
 * @author khoac
 */
public class Node<E> {

    protected E data;
    protected Node<E> left, right;

    public Node(E data) {
        this.data = data;
        this.left = this.right = null;
    }

    public E getData() {
        return data;
    }
}
