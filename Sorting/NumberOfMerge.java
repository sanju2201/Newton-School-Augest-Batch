package Sorting;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed

class NumberOfMerge {
    static int count = 0;

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n" + count);
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        count++;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

/*
 * Number of Merge
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given an unsorted array of length n and must sort it using merge sort
 * while also printing the amount of merges that occur throughout the sorting
 * process.
 * Input
 * The first line of input will be n, which represents the array's length,
 * followed by the n array items in the second line.
 * 
 * Constraints:
 * 0<= n <=100000
 * Output
 * First- line should be the sorted array and the second should be the number of
 * mergers that occurs when the array is sorted using merge sort.
 * Example
 * Sample Input:
 * 5
 * 5 1 2 7 3
 * 
 * Output:
 * 1 2 3 5 7
 * 4
 */