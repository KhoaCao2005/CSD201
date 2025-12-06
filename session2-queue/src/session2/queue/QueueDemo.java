/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.queue;

/**
 *
 * @author khoac
 */
public class QueueDemo {

    public static void main(String[] args) throws Exception {
        //Queue<Integer> queue = new ArrayQueue<>(5);
        Queue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
