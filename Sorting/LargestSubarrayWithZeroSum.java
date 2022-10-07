package Sorting;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LargestSubarrayWithZeroSum {

    public static void findMaxLengthHavingZeroSum(int[] a, int n) {
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];

            if (sum == 0) {
                maxLength = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
            }

        }
        if (maxLength == 0) {
            System.out.print("-1");
        } else
            System.out.print(maxLength);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader ipr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ipr);
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);

        String[] str1 = br.readLine().split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str1[i]);
        }
        findMaxLengthHavingZeroSum(a, n);
    }
}

/*
 * Largest subarray with zero sum
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array A[], of length N containing values in the range of negative to
 * positive integers. You need to find the length of the largest subarray whose
 * sum of elements is 0.
 * Input
 * The first line contains N denoting the size of the array A. Then in the next
 * line contains N space-separated values of the array A.
 * 
 * Constraints:-
 * 1 <= N <= 1e5
 * -1e6 <= A[i] <= 1e6
 * Output
 * Print the length of the largest subarray which has sum 0, If no subarray
 * exist print -1.
 * Example
 * Sample Input:-
 * 8
 * 15 -2 2 -8 1 7 10 23
 * 
 * Sample Output:-
 * 5
 * 
 * Explanation:-
 * -2 2 -8 1 7 is the required subarray
 * 
 * Sample Input:-
 * 5
 * 1 2 1 2 3
 * 
 * Sample Output:-
 * -1
 */