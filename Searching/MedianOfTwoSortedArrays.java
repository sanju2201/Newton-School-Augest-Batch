package Searching;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MedianOfTwoSortedArrays {

    static double median(int arr1[], int arr2[], int m, int n) {
        if (m > n)
            return median(arr2, arr1, n, m);// ensuring that binary search happens on minimum size array

        int low = 0, high = m, medianPos = ((m + n) + 1) / 2;
        while (low <= high) {
            int cut1 = (low + high) >> 1;
            int cut2 = medianPos - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 != 0)
                    return Math.max(l1, l2);
                else
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } else if (l1 > r2)
                high = cut1 - 1;
            else
                low = cut1 + 1;
        }
        return 0.0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.printf("%.2f", median(arr1, arr2, m, n));

    }
}
/*
 * Median of Two sorted Arrays
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given two sorted arrays A and B of size n and m respectively, return the
 * median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n))
 * Input
 * First line of input contains n, m the length of array A and B.
 * Next two lines contains input of array A and B.
 * 
 * Constraints
 * 1 <= n, m <= 1000
 * -1e6 <= A[i], B[i] <= 1e6
 * Output
 * Print the median of two sorted arrays upto two decimal places.
 * Example
 * Sample Input :
 * 2 1
 * 1 3
 * 2
 * 
 * Sample Output :
 * 2.00
 */