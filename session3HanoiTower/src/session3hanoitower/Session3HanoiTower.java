/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3hanoitower;

/**
 *
 * @author khoac
 */
public class Session3HanoiTower {

    /**
     * Di chuyển n đĩa từ cột a sang cột c, lấy cột b làm trung gian
     *
     * @param n
     * @param a
     * @param b
     * @param c
     */
    public static void move(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move one disk from " + a + " to " + c);
        } else {
            move(n - 1, a, c, b);
            System.out.println("Move one disk from " + a + " to " + c);
            move(n - 1, b, a, c);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        move(2, 'a', 'b', 'c');
    }

}
