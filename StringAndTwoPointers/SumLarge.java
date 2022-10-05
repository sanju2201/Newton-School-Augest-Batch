package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*;
import java.math.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumLarge {

    private static String Input1, Input2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input1 = sc.next();
        Input2 = sc.next();
        System.out.print(sum(Input1, Input2));

    }

    public static BigInteger sum(String Input1, String Input2) {

        BigInteger a = new BigInteger(Input1);
        BigInteger b = new BigInteger(Input2);

        BigInteger C = a.add(b);

        return C;
    }
}

/*
 * Sum(Large)
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given two integers a and b your task is to print the summation of these two
 * numbers
 * Input
 * Input contains a single line containing two space separated integers a and b.
 * 
 * Constraints:-
 * 1 <= a, b <= 1020000
 * Output
 * Print the sum of a and b.
 * Example
 * Sample Input:-
 * 3 8
 * 
 * Sample Output:-
 * 11
 * 
 * Sample Input:-
 * 15 1
 * 
 * Sample Output:-
 * 16
 */