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
public interface Queue<E> {

    int size();

    boolean isEmpty();

    void enqueue(E e) throws Exception;

    E first();

    E dequeue();
}
