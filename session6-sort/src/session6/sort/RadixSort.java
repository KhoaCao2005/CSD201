/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6.sort;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author khoac
 */
public class RadixSort {

    Queue<Integer> bucket[] = new Queue[10];

    public RadixSort() {
        // Initialize the bucket array
        for (int i = 0; i < 10; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    // A function to do Radix Sort of arr[] according to
    // the digit represented by exp.
    void sort(int arr[], int exp) {
        // Store numbers into the bucket array
        for (int i = 0; i < arr.length; i++) {
            bucket[(arr[i] / exp) % 10].add(arr[i]);
        }
        // Get numbers from the bucket array
        int k = 0;
        for (int i = 0; i < 10; i++) {
            while (!bucket[i].isEmpty()) {
                arr[k] = bucket[i].remove();
                k++;
            }
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // The main function to that sorts arr[]
    void sort(int arr[]) {
        // Get maximum element
        int max = getMax(arr);
        // Apply radix sort to sort elements based on place value
        for (int exp = 1; max / exp > 0; exp *= 10) {
            sort(arr, exp);
        }
    }
}
