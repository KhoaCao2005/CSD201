/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.bst;

/**
 *
 * @author khoac
 */
public class Node<E> {

    protected E key;
    protected Node<E> left, right;

    public Node(E key) {
        this.key = key;
        this.left = this.right = null;
    }

}
