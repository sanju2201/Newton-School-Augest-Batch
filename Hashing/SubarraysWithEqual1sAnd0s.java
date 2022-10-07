package Hashing;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SubarraysWithEqual1sAnd0s {

    // Funtion for Counting Sub Arerays
    public static void countSubArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                a[i] = -1;
            }
        }
        long sum = 0;
        long count = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum = sum + a[i]; // Adding all the element 1 by 1
            if (sum == 0) { // as wehave 1 and -1 so whenever sum ==0 means Having equal 1 and -1
                count++;
            }
            if (map.containsKey(sum)) { // the hashTable only contaions 0,1,-1 as key
                int freq = map.get(sum);
                count = count + freq;
                map.put(sum, freq + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        countSubArray(a, n);

    }
}

/*
 * Subarrays with equal 1s and 0s
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array arr[] of size N containing 0s and 1s only. The task is to
 * count the subarrays having an equal number of 0s and 1s.
 * Input
 * The first line of the input contains an integer N denoting the size of the
 * array and the second line contains N space-separated 0s and 1s.
 * 
 * Constraints:-
 * 1 <= N <= 10^6
 * 0 <= A[i] <= 1
 * Output
 * For each test case, print the count of required sub-arrays in new line.
 * Example
 * Sample Input
 * 7
 * 1 0 0 1 0 1 1
 * 
 * Sample Output
 * 8
 * 
 * The index range for the 8 sub-arrays are:
 * (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)
 * (2, 5), (0, 5), (1, 6)
 */