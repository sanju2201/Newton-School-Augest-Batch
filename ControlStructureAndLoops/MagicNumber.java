package ControlStructureAndLoops;

public class MagicNumber {
    static int MagicNumber(int N) {
        // Enter your code here
        if (N <= 78)
            return 79;
        int number1 = N, number2 = N;
        int ans1 = 0, ans2 = 0;
        while (number1 > 0) {
            int n = number1;
            int seven = 0, nine = 0, ex = 0;
            while (n > 0) {
                if (n % 10 == 7)
                    seven = 1;
                if (n % 10 == 9)
                    nine = 1;
                if (nine == 1 && seven == 1) {
                    ans1 = number1;
                    ex = 1;
                    break;
                }
                n /= 10;
            }
            if (ex == 1)
                break;
            number1--;
        }
        while (number2 > 0) {
            int n = number2;
            int seven = 0, nine = 0, ex = 0;
            while (n > 0) {
                if (n % 10 == 7)
                    seven = 1;
                if (n % 10 == 9)
                    nine = 1;
                if (nine == 1 && seven == 1) {
                    ans2 = number2;
                    ex = 1;
                    break;
                }
                n /= 10;
            }
            if (ex == 1)
                break;
            number2++;
        }
        int l, r;
        l = N - ans1;
        r = ans2 - N;
        if (l <= r)
            return ans1;
        return ans2;
    }
}

/*
 * Magic number
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * A magic number is a natural number that contains both the digits 7 and 9 in
 * it. For eg:- 79, 879, 53729 etc.
 * Given a number N, your task is to find the closest Magic number from the
 * given number N.
 * 
 * Note:- If more than one answer exists return the minimum one
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function MagicNumber() that takes integer N as
 * argument.
 * 
 * Constraints:-
 * 1 <= N <= 100000
 * Output
 * Return a magic number closest to the given number N.
 * Example
 * Sample Input:-
 * 8
 * 
 * Sample Output:-
 * 79
 * 
 * Sample Input:-
 * 900
 * 
 * Sample Output:-
 * 897
 */
