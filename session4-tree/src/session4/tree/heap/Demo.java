/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4.tree.heap;

/**
 *
 * @author khoac
 */
public class Demo {

    public static void main(String[] args) {
        //MaxHeap h = new MaxHeap(20);
        MinHeap h = new MinHeap(20);
        h.insert(20, 50, 80, 90, 60, 50, 70, 100);

        h.draw();
        while (!h.isEmpty()) {
            int key = h.remove();
            System.out.print(key + " ");
        }
        System.out.println();
    }
}
