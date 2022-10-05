package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumSubarray {

    public static int maxSumSubArray(long[] a, int n, long k) {
        // Initiate the value for current Sum and Minimun Length
        long curSum = 0;
        int minLen = n + 1;
        // Initiate the Value for start and End Index (As the array is unsorted so we
        // will start both the index from 0 )
        int start = 0, end = 0;

        // Check Until the end index crosses the array size name
        while (end < n) {
            // check the current sum is less then the required k
            while (curSum < k && end < n) {
                curSum += a[end++];

                // now check the sum is equal o greater tyhen the required
                while (curSum >= k && start < n) {
                    if (end - start < minLen) {
                        minLen = end - start;
                    }
                    curSum -= a[start++];
                }
            }
        }
        return minLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        long k = Long.parseLong(s[1]);

        long a[] = new long[n];
        String[] t = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(t[i]);
        }
        System.out.print(maxSumSubArray(a, n, k));
    }
}

/*
 * Sum Subarray
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given an array Arr of N integers. A subarray is good if the sum of
 * elements of that subarray is greater than or equal to K. Print the length of
 * good subarray of minimum length.
 * Input
 * First line of input contains N and K.
 * Second line of input contains N integers representing the elements of the
 * array Arr.
 * 
 * Constraints
 * 1 <= N <= 100000
 * 1 <= Arr[i] <= 100000
 * 1 <= K <= 1000000000000
 * Output
 * Print the length of good subarray of minimum length.
 * Example
 * Sample input
 * 5 12
 * 2 3 2 5 5
 * 
 * Sample output
 * 3
 * 
 * Explanation :
 * Subarray from index 3 to 5 has sum 12 and is therefore good and its length(3)
 * is minimum among all possible good subarray.
 */