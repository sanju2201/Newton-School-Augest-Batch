package Array;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountDuplicates {
    public static void countDuplicates(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        // int max=0,ele=0;
        for (int x : map.keySet()) {
            if (map.get(x) > 1) {
                System.out.println(x + " " + map.get(x));
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        countDuplicates(a, n);
    }
}

/*
 * Count duplicates
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array of N elements, your task is to find the count of repeated
 * elements. Print the repeated elements in ascending order along with their
 * frequency.
 * Have a look at the example for more understanding.
 * Input
 * The first line of input contains a single integer N, the next line of input
 * contains N space- separated integers depicting the values of the array.
 * 
 * Constraints:-
 * 1 <= N <= 100000
 * 1 <= Arr[i] <= 100000
 * Output
 * For each duplicate element in sorted order in a new line, First, print the
 * duplicate element and then print its number of occurence space- separated.
 * 
 * Note:- It is guaranteed that at least one duplicate element will exist in the
 * given array.
 * Example
 * Sample Input:-
 * 5
 * 3 2 1 1 2
 * 
 * Sample Output:-
 * 1 2
 * 2 2
 * 
 * Sample Input:-
 * 5
 * 1 1 1 1 5
 * 
 * Sample Output:-
 * 1 4
 * 
 * Explaination:
 * test 1: Only 1 and 2 are repeated. Both are repeated twice. So, we print:
 * 1 -> frequency of 1
 * 2 -> frequency of 2
 * 1 is printed before 2 as it is smaller than 2
 */