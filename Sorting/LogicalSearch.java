package Sorting;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LogicalSearch {

    public static int findMissingValue(int arr[], int n) {
        int l = 0;
        int r = n - 1;
        int d = (arr[r] - arr[l]) / n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            // to find the missing element
            if (m + 1 < n && arr[m + 1] - arr[m] != d) {
                return arr[m + 1] - d;
            }
            if (m - 1 >= 0 && arr[m] - arr[m - 1] != d) {
                return arr[m] - d;
            }
            // dicard half
            if (arr[m] - arr[0] != m * d) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int value = findMissingValue(arr, n);
        System.out.println(value);
    }
}

/*
 * Logical search
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a sequence of n numbers such that the difference between the
 * consecutive terms is constant, find the missing term in logarithmic time.
 * Assume that the first and last elements are always part of the input sequence
 * and the missing number lies between index 1 to n-1.
 * Solve the problem using divide and conquer approach.
 * Input
 * first line contain a single integer N.
 * second line contain N space separated integer A[i].
 * Output
 * print missing number in given array.
 * 
 * Constraint :
 * 1<=N<=10^5
 * 1<=A[i]<=10^9
 * Example
 * Sample Input 1:
 * 5
 * 5 7 9 11 15
 * 
 * Sample Output 1:
 * 13
 * 
 * Sample Input 2:
 * 5
 * 1 4 7 13 16
 * 
 * Sample Output 2:
 * 10
 */