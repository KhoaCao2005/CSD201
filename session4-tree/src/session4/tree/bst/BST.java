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
public class BST<E extends Comparable<E>> {

    protected Node<E> root;

    public BST() {
        this.root = null;
    }

    public void show(Node<E> root, String prefix, String childrenPrefix) {
        if (root == null) {
            return;
        }
        System.out.printf("%s%s\n", prefix, root.key);
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

    public Node<E> insert(Node<E> p, E key) throws Exception {
        if (p == null) {
            p = new Node<>(key);
        } else if (key.compareTo(p.key) == 0) {
            throw new Exception("This key is already.");
        } else if (key.compareTo(p.key) > 0) {
            p.right = insert(p.right, key);
        } else {
            p.left = insert(p.left, key);
        }
        return p;
    }

    public void insert(E key) throws Exception {
        this.root = this.insert(this.root, key);
    }

    public void insert(E... keys) throws Exception {
        for (E key : keys) {
            this.insert(key);
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
        return search(this.root, key);
    }

    public Node<E> findSuccessor(Node<E> p) {
        Node<E> q = p.right;
        while (q.left != null) {
            q = q.left;
        }
        return q;
    }

    public Node<E> delete(Node<E> p, E key) {
        if (p == null) {
            return null;
        }
        if (key.compareTo(p.key) < 0) {
            p.left = delete(p.left, key);
        } else if (key.compareTo(p.key) < 0) {
            p.right = delete(p.right, key);
        } else {
            if (p.left == null) {
                return p.right;
            } else if (p.right == null) {
                return p.left;
            }
            p.key = this.findSuccessor(p).key;
            p.right = delete(p.right, p.key);
        }
        return p;
    }

    public Node<E> delete(E key) {
        return this.delete(this.root, key);
    }

    public Node<E> findPredecessor(Node<E> p) {
        Node<E> q = p.left;
        while (q.right != null) {
            q = q.right;
        }
        return q;
    }

    public Node<E> delete2(Node<E> p, E key) {
        if (p == null) {
            return null;
        }
        if (key.compareTo(p.key) < 0) {
            p.left = delete2(p.left, key);
        } else if (key.compareTo(p.key) < 0) {
            p.right = delete2(p.right, key);
        } else {
            if (p.left == null) {
                return p.right;
            } else if (p.right == null) {
                return p.left;
            }
            p.key = this.findPredecessor(p).key;
            p.left = delete2(p.right, p.key);
        }
        return p;
    }
    
    public Node<E> delete2(E key) {
        return this.delete(this.root, key);
    }

    public void LNR(Node<E> p) {
        if (p != null) {

            LNR(p.left);
            System.out.print(p.key + " ");
            LNR(p.right);
        }
    }

    public void LNR() {
        LNR(this.root);
        System.out.println();
    }

    public void RNL(Node<E> p) {
        if (p != null) {

            RNL(p.right);
            System.out.print(p.key + " ");
            RNL(p.left);
        }
    }

    public void RNL() {
        RNL(this.root);
        System.out.println();
    }
}
