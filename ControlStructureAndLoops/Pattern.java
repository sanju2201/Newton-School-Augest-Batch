package ControlStructureAndLoops;

public class Pattern {
    static void Pattern(int N) {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 1) {
                    i++;
                }
                if (j == 0 || j == i || i == N) {
                    System.out.print("*");
                } else {
                    System.out.print("^");
                }
            }
            System.out.println();
        }
    }

}

/*
 * Pattern
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer N, you have to print the given below pattern for N >= 3.
 * 
 * Pattern for N = 4:-
 *
 * ^*
 * ^^*
 *****
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function Pattern() that takes integers N as
 * argument.
 * 
 * Constraints:-
 * 1 <= N <= 100
 * Output
 * Print the given pattern for size N.
 * Example
 * Sample input:-
 * 3
 * 
 * Sample Output:-
 *
 * ^*
 ****
 * 
 * Sample Input:-
 * 6
 * 
 * Sample Output:-
 *
 * ^*
 * ^^*
 * ^^^*
 * ^^^^*
 */
