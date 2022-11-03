package Sorting;

import java.util.*;

class QuickSort {
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(int a[], int l, int r) {
        int pivot = a[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    public static void quickSort(int a[], int l, int r) {
        if (l < r) {
            int p = partition(a, l, r);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, r);
        }
    }

    public static void main(String[] args) {
        // Scanner sc= new Scanner();
        int a[] = { 5, 2, 6, 3, 7, 4, 1 };
        int n = a.length;

        quickSort(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}