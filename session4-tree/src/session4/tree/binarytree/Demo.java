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
public class Demo {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.root = new Node<>(10);
        Node<Integer> p1 = tree.addLeft(tree.root, 20);
        Node<Integer> p2 = tree.addRight(tree.root, 30);
        tree.addLeft(p1, 40);
        tree.addRight(p1, 50);
        tree.addRight(p2, 60);
        tree.NLR();
        tree.LNR();
        tree.LRN();
        tree.show();
        tree.BFS();
        tree.NodesAtLevel(2);
        System.out.println("Height: " + tree.getHeight());
        System.out.println("Number of leaf nodes: " + tree.countLeafNodes());
        System.out.println("Is full binary tree: " + tree.isFullBinaryTree());
        System.out.println("Is complete binary tree: " + tree.isCompleteBinaryTree());
    }
}
