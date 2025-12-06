/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.avl;

/**
 *
 * @author khoac
 */
public class Node<E> {
    E key;
    int height;
    Node<E> left, right;

    public Node(E key) {
        this.key = key;
        this.height = 1;
        this.left = this.right = null;
    }
    
}
