/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.avl;

import java.util.Random;

/**
 *
 * @author khoac
 */
public class Demo {

    /**
     * Tạo AVL Tree ngẫu nhiên gồm n Node có key ngẫu nhiên thuộc đoạn [min,
     * max]
     *
     * @param n
     * @param min
     * @param max
     */
    public static void randomAVLT(AVLTree<Integer> tree, int n, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tree.insert((int) (r.nextDouble() * (max - min + 1)) + min);
        }
    }

    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<>();
        //tree.insert(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        randomAVLT(tree, 20, 1, 100);
        tree.show();
        tree.LNR();
        tree.RNL();
    }
}
