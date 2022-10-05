package Sorting;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = maxSum(a, 0, n - 1);
        System.out.println(max);
    }

    public static int maxSum(int[] a, int l, int r) {
        int m = 0;
        if (l > r)
            return Integer.MIN_VALUE;
        if (l == r) {
            return a[l];
        }
        if (l < r) {
            m = l + (r - l) / 2;

            // maxSum(a,l,m-1);
            // maxSum(a,m+1,r);
            // maxCrossingSum(a,l,m,r);
        }
        return Math.max(Math.max(maxSum(a, l, m - 1), maxSum(a, m + 1, r)), maxCrossingSum(a, l, m, r));

    }

    public static int maxCrossingSum(int[] a, int l, int m, int r) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + a[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = m; i <= r; i++) {
            sum = sum + a[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return Math.max((leftSum + rightSum - a[m]), (Math.max(leftSum, rightSum)));
    }
}

/*
 * Maximum Subarray Sum using Divide and Conquer
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array, find the maximum subarray sum among all subarrays
 * using divide and conquer (DnC) technique.
 * 
 * Time complexity of the algorithm should be O(nlogn).
 * Input
 * First line contains a single integer N, denoting the size of array.
 * Second line contains N space separated integers.
 * 
 * Constraints :
 * 1 <= N <= 10^5
 * -10^9 <= arr[i] <= 10^9
 * Output
 * A single integer denoting the maximum sum of subarray.
 * Example
 * Input:
 * 7
 * 2 -4 1 9 -6 7 -3
 * 
 * Output:
 * 11
 * 
 * Explanation :
 * [1, 9, -6, 7 ] gives maximum sum.
 */