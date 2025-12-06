/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3tailrecursion;

/**
 *
 * @author khoac
 */
public class Session3TailRecursion {

    /**
     * Tính S = 0 + 1 + ... + n (n>=0)
     *
     * @param n
     * @return
     */
    public static int sum(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return sum(n - 1) + n;
    }

    public static int tail_sum(int n, int result) {
        if (n == 0) {
            return result;
        }
        return tail_sum(n - 1, result + n);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long tail_factorial(int n, int result) {
        if (n == 0) {
            return result;
        }
        return tail_factorial(n - 1, result * n);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(tail_sum(5, 0));
        System.out.println(factorial(5));
        System.out.println(tail_factorial(5,1));
    }

}
