/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.queue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author khoac
 */
public class JavaQueueDemo {

    public static void main(String[] args) {
        java.util.Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
