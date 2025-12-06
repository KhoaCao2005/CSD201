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
public class AVLTree<E extends Comparable<E>> {

    Node<E> root;

    public AVLTree() {
        this.root = null;
    }

    int height(Node<E> p) {
        if (p == null) {
            return 0;
        }
        return p.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public Node<E> rightRotation(Node<E> T) {
        Node<E> T1 = T.left;
        Node<E> R1 = T1.right;

        // Perform rotation
        T1.right = T;
        T.left = R1;

        // Update heights
        T.height = max(height(T.left), height(T.right)) + 1;
        T1.height = max(height(T1.left), height(T1.right)) + 1;

        // Return new root
        return T1;
    }

    public Node<E> leftRotation(Node<E> T) {
        Node<E> T1 = T.right;
        Node<E> L1 = T1.left;

        // Perform rotation
        T1.left = T;
        T.right = L1;

        // Update heights
        T.height = max(height(T.left), height(T.right)) + 1;
        T1.height = max(height(T1.left), height(T1.right)) + 1;

        // Return new root
        return T1;
    }

    // Get Balance factor of node N
    int getBalance(Node<E> N) {
        if (N == null) {
            return 0;
        }

//        return height(N.left) - height(N.right);
        return height(N.right) - height(N.left);
    }

    Node<E> insert(Node<E> node, E key) {

        /* 1.  Perform the normal BST insertion */
        if (node == null) {
            return (new Node<E>(key));
        }

        if (key.compareTo(node.key) < 0) {
            node.left = insert(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = insert(node.right, key);
        } else // Duplicate keys not allowed
        {
            return node;
        }

        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left),
                height(node.right));

        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there
        // are 4 cases 
        // Left Left Case
        if (balance < -1 && key.compareTo(node.left.key) < 0) {
            return rightRotation(node);
        }

        // Right Right Case
        if (balance > 1 && key.compareTo(node.right.key) > 0) {
            return leftRotation(node);
        }

        // Left Right Case
        if (balance < -1 && key.compareTo(node.left.key) > 0) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }

        // Right Left Case
        if (balance > 1 && key.compareTo(node.right.key) < 0) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }

        /* return the (unchanged) node pointer */
        return node;
    }

    void insert(E... keys) {
        for (E key : keys) {
            this.root = this.insert(this.root, key);
        }
    }

    public void show(Node<E> p, String prefix, String childrenPrefix) {
        if (p == null) {
            return;
        }
        System.out.printf("%s%s\n", prefix, p.key);
        if (p.right == null) {
            show(p.left, childrenPrefix + "L--", childrenPrefix + "   ");
        } else {
            show(p.left, childrenPrefix + "L--", childrenPrefix + "|  ");
            show(p.right, childrenPrefix + "R--", childrenPrefix + "   ");
        }
    
    }

    public void show() {
        this.show(this.root, "", "");
    }

    public void LNR() {
        this.LNR(this.root);
    }

    public void LNR(Node<E> p) {
        if (p != null) {
            LNR(p.left);
            System.out.println(p.key);
            LNR(p.right);
        }
    }

    public void RNL() {
        this.RNL(this.root);
    }

    public void RNL(Node<E> p) {
        if (p != null) {
            RNL(p.right);
            System.out.println(p.key);
            RNL(p.left);
        }
    }

    public Node<E> search(Node<E> p, E key) {
        if (p == null) {
            return null;
        } else if (key.compareTo(p.key) == 0) {
            return p;
        } else if (key.compareTo(p.key) > 0) {
            return search(p.right, key);
        } else {
            return search(p.left, key);
        }
    }

    public Node<E> search(E key) {
        return this.search(this.root, key);
    }
    
    
}
