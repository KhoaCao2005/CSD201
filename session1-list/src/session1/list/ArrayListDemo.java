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
public class ArrayListDemo {
    
    public static void display(IList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(5);
        IList<Integer> list = new ArrayList<>(5);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        display(list);
        list.remove(3);
        list.remove(2);
        list.insert(2, 100);
        display(list);
    }
}
