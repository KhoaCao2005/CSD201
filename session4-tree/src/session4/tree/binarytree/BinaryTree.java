/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author khoac
 */
public class BinaryTree<E> {

    protected Node<E> root;

    public BinaryTree() {
        this.root = null;
    }

    /**
     * Thêm node con bên trái của node p
     *
     * @param p
     * @param data
     * @return
     */
    public Node<E> addLeft(Node<E> p, E data) {
        return p.left = new Node<>(data);
    }

    /**
     * Thêm node con bên phải của node p
     *
     * @param p
     * @param data
     * @return
     */
    public Node<E> addRight(Node<E> p, E data) {
        return p.right = new Node<>(data);
    }

    /**
     * Duyệt cây gốc p theo phương pháp NLR
     *
     * @param p
     */
    public void NLR(Node<E> p) {
        if (p != null) {
            System.out.print(p.data + " ");
            NLR(p.left);
            NLR(p.right);
        }
    }

    public void NLR() {
        NLR(this.root);
        System.out.println();
    }

    public void LNR(Node<E> p) {
        if (p != null) {

            LNR(p.left);
            System.out.print(p.data + " ");
            LNR(p.right);
        }
    }

    public void LNR() {
        LNR(this.root);
        System.out.println();
    }

    public void LRN(Node<E> p) {
        if (p != null) {

            LRN(p.left);

            LRN(p.right);
            System.out.print(p.data + " ");
        }
    }

    public void LRN() {
        LRN(this.root);
        System.out.println();
    }

    public void show(Node<E> root, String prefix, String childrenPrefix) {
        if (root == null) {
            return;
        }
        System.out.printf("%s%s\n", prefix, root.data);
        if (root.right == null) {
            show(root.left, childrenPrefix + "L--", childrenPrefix + "   ");
        } else {
            show(root.left, childrenPrefix + "L--", childrenPrefix + "|  ");
            show(root.right, childrenPrefix + "R--", childrenPrefix + "   ");
        }
    }

    public void show() {
        this.show(this.root, "", "");
    }

    public void BFS() {
        if (this.root == null) {
            return;
        }
        Queue q = new LinkedList();
        q.add(this.root);
        while (!q.isEmpty()) {
            Node p = (Node) q.poll();
            if (p.left != null) {
                q.add(p.left);
            }
            if (p.right != null) {
                q.add(p.right);
            }
            System.out.print(p.data + " ");
        }
        System.out.println();
    }

    public void NodesAtLevel(Node<E> p, int k) {
        if (p != null) {
            if (k == 0) {
                System.out.print(p.data + " ");
            }
            NodesAtLevel(p.left, k - 1);
            NodesAtLevel(p.right, k - 1);
        }
    }

    public void NodesAtLevel(int k) {
        this.NodesAtLevel(this.root, k);
        System.out.println();
    }

    public int getHeight(Node<E> p) {
        if (p == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(p.left), getHeight(p.right));
    }

    public int getHeight() {
        return this.getHeight(this.root);
    }

    /**
     * Đếm số node lá của cây gốc p
     *
     * @param p
     * @return
     */
    public int countLeafNodes(Node<E> p) {
        if (p == null) {
            return 0;
        }
        if (p.left == null && p.right == null) {
            return 1;
        }
        return countLeafNodes(p.left) + countLeafNodes(p.right);
    }

    public int countLeafNodes() {
        return this.countLeafNodes(this.root);
    }

    /**
     * Kiểm tra cây gốc p có phải là Full Binary Tree
     *
     * @param p
     * @return
     */
    public boolean isFullBinaryTree(Node<E> p) {
        if (p == null) {
            return true;
        }
        if ((p.left == null && p.right != null) || (p.left != null && p.right == null)) {
            return false;
        }
        return this.isFullBinaryTree(p.left) && this.isFullBinaryTree(p.right);
    }

    public boolean isFullBinaryTree() {
        return this.isFullBinaryTree(this.root);
    }

    /**
     * Kiểm tra cây gốc p có phải là Complete Binary Tree
     *
     * @param p
     * @return
     */
    public boolean isCompleteBinaryTree(Node<E> p) {
        int numOfLeafNodes = this.countLeafNodes();
        int height = this.getHeight();
        return numOfLeafNodes == Math.pow(2, height - 1);
    }

    public boolean isCompleteBinaryTree() {
        return this.isCompleteBinaryTree(this.root);
    }
}
