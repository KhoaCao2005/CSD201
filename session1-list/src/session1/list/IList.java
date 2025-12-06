/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session1.list;

/**
 *
 * @author khoac
 */
public interface IList<T> {

    //"T"kieu tham so chua biet
    int size();

    boolean isEmpty();

    boolean isFull();

    T first();

    T last();

    boolean addFirst(T e);

    boolean addLast(T e);

    T removeFirst();

    T removeLast();

    boolean insert(int i, T e);

    T remove(int i);

    T get(int i);
}
