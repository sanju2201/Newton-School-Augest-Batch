package Searching;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckIfArrayIsSortedAndRotatedClockwise {
    public static boolean sortedArrayRotatedClockwise(int arr[], int n) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1])
                a++;
            else
                b++;
        }
        if (a == 1 || b == 1) {
            if (arr[n - 1] < arr[0])
                a++;
            else
                b++;
            if (a == 1 || b == 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            boolean a = sortedArrayRotatedClockwise(arr, n);
            if (a == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

/*
 * Check if array is sorted and rotated clockwise
 * easy
 * hint
 * Hint
 * 
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array arr[] of N distinct integers, check if this array is Sorted
 * and Rotated clockwise.
 * A sorted array is not considered as sorted and rotated, i.e., there should be
 * at least one rotation.
 * 
 * Note:-Array can be sorted both increasingly and decreasingly
 * Input
 * The first line of input contains number of testcases T. Each testcase
 * contains 2 lines, the first line contains N, the number of elements in array,
 * and second line contains N space separated elements of array.
 * 
 * Constraints:
 * 1 <= T <= 50
 * 3 <= N <= 10^3
 * 1 <= A[i] <= 10^4
 * 
 * 
 * 
 * Output
 * Print "Yes" if the given array is sorted and rotated, else Print "No",
 * without Inverted commas.
 * Example
 * Sample Input:
 * 2
 * 4
 * 3 4 1 2
 * 3
 * 1 3 2
 * 
 * Sample Output:
 * Yes
 * Yes
 * 
 * Explanation:
 * Testcase 1: The array is sorted (1, 2, 3, 4) and rotated twice (3, 4, 1, 2).
 * Testcase 2: The array is sorted (3, 2, 1) and rotated once (1, 3, 2).
 */