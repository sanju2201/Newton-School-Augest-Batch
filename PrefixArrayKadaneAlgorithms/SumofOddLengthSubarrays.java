package PrefixArrayKadaneAlgorithms;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumofOddLengthSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long prefix[] = new long[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i - j + 1) % 2 == 1) {
                    if (j == 0) {
                        ans += prefix[i];
                    } else {
                        ans += prefix[i] - prefix[j - 1];
                    }
                }
            }
        }
        System.out.print(ans);
    }
}
/*
 * Sum of Odd Length Subarrays
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array of positive integers A of size N. The power of an array is
 * defined as sum of all elements in it. Calculate the sum of powers of all
 * possible odd - length subarrays.
 * A subarray is a contiguous subsequence of the array.
 * Input
 * First line contains an integer N.
 * Next line contains N space separated integers denoting elements of array.
 * 
 * Constraints
 * 1 <= N <= 1000
 * 1 <= Ai <= 10^5
 * Output
 * Print the sum of powers of all possible odd - length subarrays.
 * Example
 * Sample Input 1:
 * 5
 * 1 4 2 5 3
 * 
 * Output
 * 58
 * 
 * Explanation:
 * The odd- length subarrays of A and their sums are:
 * [1] = 1
 * [4] = 4
 * [2] = 2
 * [5] = 5
 * [3] = 3
 * [1, 4, 2] = 7
 * [4, 2, 5] = 11
 * [2, 5, 3] = 10
 * [1, 4, 2, 5, 3] = 15
 * If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 * 
 * Sample Input 2:
 * 2
 * 1 2
 * 
 * Output
 * 3
 * 
 * Explanation:
 * There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
 */
