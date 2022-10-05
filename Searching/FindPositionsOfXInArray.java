package Searching;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindPositionsOfXInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            boolean isPresent = false;
            for (int i = 0; i < N; i++) {
                if (arr[i] == X) {
                    System.out.print(i + " ");
                    isPresent = true;
                }
            }
            if (isPresent == false)
                System.out.print("Not found");
            System.out.println();
        }

    }
}

/*
 * Find Positions of X in array
 * easy
 * hint
 * Hint
 * 
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array arr[] of size N and an element X. The task is to find
 * and print the indices of the given element if it is present in array if not
 * then print “Not found” without quotes.
 * 
 * Note: The elements may be present more than once.
 * Input
 * The first line of input contains T, denoting the number of test cases.
 * The first line of each test case contains N and X, N is the size of array and
 * X is an element. Second line contains elements of array space separated. If
 * not present then print "Not found" without quotes
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N, X <= 10000
 * 1 <= arr[i] <= 100000
 * Output
 * For each test case in new line you need to print all the positions where you
 * find the X separated by space.
 * Assume 0-indexing
 * Example
 * Input:
 * 2
 * 5 6
 * 2 3 6 5 6
 * 4 3
 * 2 4 6 5
 * 
 * Output:
 * 2 4
 * Not found
 */