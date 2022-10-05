package Searching;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        findMatch(k);
    }

    public static void findMatch(long k) {
        long l = 1;
        long r = (int) Math.sqrt(k);
        while (r >= l) {
            long m = l + (r - l) / 2;
            if (k == (m * m) + (3 * m)) {
                System.out.println(m);
                return;
            } else if (k < (m * m) + (3 * m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        System.out.println("-1");
    }
}

/*
 * Find it!!
 * easy
 * hint
 * Hint
 * 
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer K, find a positive integer x such that K = x2 + 3*x. If no
 * such positive integer x exists, print -1.
 * Input
 * First and the only line of the input contains an integer K.
 * 
 * Constraints:
 * 1 <= K <= 1018
 * Output
 * Print a positive integer x such that the above equation satisfies. If no such
 * integer x exists, print -1.
 * Example
 * Sample Input:
 * 28
 * 
 * Sample Output:
 * 4
 * 
 * Explaination:
 * 42 + 3*4 = 28
 * There is no other positive integer that will give such result.
 */