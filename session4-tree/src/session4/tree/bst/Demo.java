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
public class Demo {
    
    public static void main(String[] args) throws Exception {
        BST<Integer> tree = new BST<>();
        //tree.insert(10, 20, 30, 40, 50, 60, 70, 80, 90);
        tree.insert(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        tree.show();
        tree.delete(50);
        tree.show();
        tree.delete2(50);
        tree.show();
    }
}
