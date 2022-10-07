package Sorting;

public class ImplementingMergeSort {

    public static int[] implementMergeSort(int arr[], int start, int end) {
        if (start < end) {
            int m = start + (end - start) / 2;
            implementMergeSort(arr, start, m);
            implementMergeSort(arr, m + 1, end);
            merge(arr, start, m, end);
        }
        return arr;
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1]; // [0 ,0 ,0 ,0 ] 4
        int R[] = new int[n2]; // [ , , ]

        for (int i = 0; i < n1; i++) { // L [0 1 2 3]
            L[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) { // till the time at least both arrays have elements to compare
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
 * Implementing Merge Sort
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an unsorted array, your task is to sort the array using merge sort.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function implementMergeSort() that takes 3
 * arguments.
 * arr: input array
 * start: starting index which is 0
 * end: ending index of array
 * 
 * Constraints
 * 1 <= T <= 100
 * 1 <= N <= 10^4
 * 1 <= Arr[i] <= 10^5
 * 
 * Sum of 'N' over all test cases does not exceed 10^6
 * Output
 * You need to return the sorted array. The driver code will print the array in
 * sorted form.
 * Example
 * Sample Input:
 * 2
 * 3
 * 3 1 2
 * 3
 * 4 5 6
 * 
 * Sample Output:
 * 1 2 3
 * 4 5 6
 */