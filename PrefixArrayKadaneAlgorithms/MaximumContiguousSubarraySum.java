package PrefixArrayKadaneAlgorithms;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumContiguousSubarraySum {

    // Maximum Contiguous Subarray Sum Method
    public static void maxPossSubSum(int[] a, int n) {
        long maxCountSum = -10000000;
        long prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum = prefixSum + a[i];
            if (prefixSum > maxCountSum) {
                maxCountSum = prefixSum;
            }
            if (prefixSum < 0) {
                prefixSum = 0;
            }
        }
        System.out.println(maxCountSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            maxPossSubSum(a, n);
        }

    }
}

/*
 * Maximum Contiguous Subarray Sum
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array, A of length N, find the contiguous subarray within A which
 * has the largest sum.
 * Input
 * First line of each test case contain the number of test cases.
 * The first line of each test case contains an integer n, the length of the
 * array A
 * and the next line contains n integers.
 * 
 * Constraints:
 * 1<=T<=100
 * 1 <= N <= 10^5
 * -10^6 <= A[i] <= 10^6
 * Output
 * Output an integer representing the maximum possible sum of the contiguous
 * subarray.
 * Example
 * Input:
 * 1
 * 5
 * 1 2 3 4 -10
 * 
 * Output:
 * 10
 * 
 * Explanation:-
 * 1+2+3+4=10
 */