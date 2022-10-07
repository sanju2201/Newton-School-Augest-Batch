package Sorting;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OddOccurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);// n^2
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(arr[i]);
                break;
            }

            if (arr[i] == arr[i + 1]) {
                i++;
            } else {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

/*
 * Odd occurring
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array where every element appears an even number of times,
 * except one element which appears an odd number of times. If the identical
 * elements appear in pairs in the array and there cannot be more than two
 * consecutive occurrences of an element, find the odd occurring element in
 * logarithmic time and constant space.
 * Solve given problem in O(n) using the divide and conquer approach.
 * Input
 * The first line contains a single integer N.
 * The second line contains N space- separated integer A[i].
 * Output
 * Print odd occurring element.
 * Example
 * Sample Input 1:
 * 5
 * 5 5 3 4 4
 * 
 * Sample Output 1:
 * 3
 * 
 * Sample Input 2:
 * 5
 * 1 1 4 4 16
 * 
 * Sample Output 2:
 * 16
 */