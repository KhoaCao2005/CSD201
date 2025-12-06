/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.queue;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author khoac
 */
public class LinkedQueue<E> implements Queue<E> {
    private List<E> list = new LinkedList<>();
    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void enqueue(E e) throws Exception {
        this.list.add(e);
    }

    @Override
    public E first() {
        if(this.isEmpty()){
            return null;
        }
        return this.list.get(0);
    }

    @Override
    public E dequeue() {
        if(this.isEmpty()){
            return null;
        }
        return this.list.remove(0);
    }
    
}
