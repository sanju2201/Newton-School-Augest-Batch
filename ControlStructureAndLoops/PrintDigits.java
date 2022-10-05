package ControlStructureAndLoops;

public class PrintDigits {
    static void Print_Digits(int N) {
        // Enter your code here
        int r;
        if (N == 0) {
            return;
        }
        r = N % 10;
        Print_Digits(N / 10);
        switch (r) {
            case 0:
                System.out.print("zero ");
                break;

            case 1:
                System.out.print("one ");
                break;

            case 2:
                System.out.print("two ");
                break;

            case 3:
                System.out.print("three ");
                break;

            case 4:
                System.out.print("four ");
                break;

            case 5:
                System.out.print("five ");
                break;

            case 6:
                System.out.print("six ");
                break;

            case 7:
                System.out.print("seven ");
                break;

            case 8:
                System.out.print("eight ");
                break;

            case 9:
                System.out.print("nine ");
                break;
        }
    }
}

/*
 * Print Digits
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a natural number N, your task is to print all the digits of the number
 * in words. The words have to separated by space and in lowercase english
 * letters.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function Print_Digit() that takes integer N as a
 * parameter.
 * 
 * Constraints:-
 * 1 <= N <= 10000000
 * Output
 * Print the digits of the number as shown in the example.
 * 
 * Note:- Print all digits in lowercase English letters
 * Example
 * Sample Input:-
 * 1024
 * 
 * Sample Output:-
 * one zero two four
 * 
 * Sample Input:-
 * 2
 * 
 * Sample Output:-
 * two
 */