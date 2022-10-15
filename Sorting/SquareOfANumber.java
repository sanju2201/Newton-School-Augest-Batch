package Sorting;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SquareOfANumber {
    public static int power(int n, int p) {
        int res = 1;
        while (p > 0) {
            if ((p & 1) == 1) {
                res = res * n;
            }
            p = p >> 1;
            n = n * n;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(power(n, 2));
    }
}
/*
 * Square of a number
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer, find its square without using the multiplication and
 * division operator.
 * Do not use any inbuilt library.
 * Input
 * First line contain a single integer N.
 * Output
 * print square of given number.
 * 
 * Constraints :
 * 1<=N<=10000
 * Example
 * Sample Input 1:
 * 14
 * 
 * 
 * Sample Output 1:
 * 196
 * 
 * 
 * Sample Input 2:
 * 500
 * 
 * Sample Output 2:
 * 250000
 */