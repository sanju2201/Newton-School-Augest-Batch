package BasicsOfProgramming;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TriangleOfHeightN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }
}

/*
 * Triangle of height N
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Print a right angled triangle of given height N as shown in example.
 * Input
 * The input contains a single integer N.
 * 
 * Constraints:-
 * 1 <= N <= 10
 * Output
 * Print the Right angled triangle of height N.
 * Example
 * Sample Input:-
 * 3
 * 
 * Sample Output:-
 *
 **
 ***
 * 
 * Sample Input:-
 * 4
 * 
 * Sample Output:-
 *
 **
 ***
 */