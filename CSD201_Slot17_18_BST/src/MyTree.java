/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khoac
 */
public class MyTree {

    Node root;

    public MyTree() {
        this.root = null;
    }

    public void load() {
        insert(20);
        insert(10);
        insert(30);
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        insert(100);

    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node p, int value) {
        if (p == null) {
            p = new Node(value);
        } else if (value < p.info) {
            p.left = insertRec(p.left, value);
        } else if (value > p.info) {
            p.right = insertRec(p.right, value);
        }
        return p;
    }

    public void visit(Node p) {
        System.out.println(p.info + " ");
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        } else {
            visit(p);
            preOrder(p.left);
            preOrder(p.right);
        }
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        } else {
            inOrder(p.left);
            visit(p);
            inOrder(p.right);
        }
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        } else {
            postOrder(p.left);
            postOrder(p.right);
            visit(p);
        }
    }

    int search(Node p, int x) {
        if (p == null) {
            return 0;
        }
        if (p.info == x) {
            return 1;
        }
        if (x < p.info) {
            return search(p.left, x);
        } else {
            return search(p.right, x);
        }
    }

    int getHeight(Node p) {
        if (p == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(p.left), getHeight(p.right));
    }

    int countNodes(Node p) {
        if (p == null) {
            return 0;
        }
        return 1 + countNodes(p.left) + countNodes(p.right);
//        Chỉ đếm Node có giá trị lớn hơn 5
//        int x = ((p.info) > 5 ? 1 : 0);
//        return x + countNodes(p.left) + countNodes(p.right);
    }

    int countLeafNodes(Node p) {
        if (p == null) {
            return 0;
        }
        int x = (p.left == null && p.right == null) ? 1 : 0;
        return x + countLeafNodes(p.left) + countLeafNodes(p.right);
    }

    int sum(Node p) {
        if (p == null) {
            return 0;
        }
        return p.info + sum(p.left) + sum(p.right);
    }

    // 1. Test f1 - compute height
    public int f1() {
        return this.getHeight(root) - 1;
    }

    // 2. Test f2 - count nodes
    public int f2() {
        return countNodes(root);
    }

    // 3. Test f3 - count leaf nodes
    public int f3() {
        return countLeafNodes(root);
    }

    // 4. Test f4 - compute sum of nodes 
    public int f4() {
        return sum(root);
    }

    // 5. Test f5 - Pre-Order 
    public void f5() {
        preOrder(root);
    }

    // 6. Test f6 - In-Order
    public void f6() {
        inOrder(root);
    }

    // 7. Test f7 - Post-Order
    public void f7() {
        postOrder(root);
    }

    // 8. Test f8 - Search
    int f8(int n) {
        return search(root, n);
    }
}
