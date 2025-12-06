/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6.sort;

/**
 *
 * @author khoac
 */
public class Sorter {

    private static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    public static void insertionSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int x = a[i];
            int j = i - 1;
            while (j >= 0 && x < a[j]) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = x;
        }
    }

    public static void bubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }
    }
}
