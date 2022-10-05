package Searching;

import java.io.*;
import java.util.*;

class SumOfCubes {
    static boolean binary_search(long a[], int n, long tar) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == tar) {
                return true;
            }
            if (a[mid] < tar)
                l = mid + 1;

            else
                r = mid - 1;
        }
        return false;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long a[] = new long[10000];
        for (int i = 1; i <= 10000; i++) {
            a[i - 1] = (long) i * (long) i * (long) i;
        }
        boolean ans = false;
        for (long i = 1; i <= 10000; i++) {
            if (binary_search(a, 10000, n - i * i * i)) {
                ans = true;
                break;
            }
        }
        if (ans) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}

/*
 * Sum of Cubes
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given a positive integer N. Check whether the number N is
 * representable as the sum of the cubes of two positive integers i. e. check
 * whether there exist two positive integers a and b such that a^3 + b^3 = N.
 * Input
 * First line contains an integer N.
 * 
 * Constraints
 * 1 <= N <= 10^12
 * Output
 * Print "YES" if N is representable as the sum of the cubes of two positive
 * integers otherwise "NO".
 * Example
 * Sample Input 1:
 * 3
 * 
 * Output
 * NO
 * 
 * Explanation:
 * 3 cannot be represented as sum of two cubes.
 * 
 * Sample Input 2:
 * 35
 * 
 * Output
 * YES
 * 
 * Explanation:
 * 35 = 8 + 27 = 2^3 + 3^3
 */