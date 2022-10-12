package Sorting;

import java.util.*;

public class OptimiseBubbleSort {

    public static void bubbleSort(int[] a, int n) {
        int temp = 0;
        boolean check;
        for (int i = 0; i < n; i++) {
            check = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                break;
            }
            System.out.print("sd" + " ");

        }
    }

    public static void insertionSort(int[] a, int n) {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 5, 2, 6, 4, 1, 3, 7, 8, 9 };
        int n = a.length;
        // bubbleSort(a, n);
        insertionSort(a, n);

        // System.out.println("Bubble Sort");
        System.out.println("Insertion Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
