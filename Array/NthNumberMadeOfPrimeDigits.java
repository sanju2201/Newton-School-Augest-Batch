package Array;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NthNumberMadeOfPrimeDigits {
    static String nthprimedigitsnumber(int number) {
        int rem;
        String num = "";
        while (number > 0) {
            // remainder for check element position
            rem = number % 4;
            switch (rem) {

                // if number is 1st position in tree
                case 1:
                    num += '2';
                    break;

                // if number is 2nd position in tree
                case 2:
                    num += '3';
                    break;

                // if number is 3rd position in tree
                case 3:
                    num += '5';
                    break;

                // if number is 4th position in tree
                case 0:
                    num += '7';
                    break;
            }

            if (number % 4 == 0)
                number--;

            number = number / 4;
        }

        return new StringBuilder(num).reverse().toString();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(nthprimedigitsnumber(n));
            t--;
        }
    }
}

/*
 * Nth number made of prime digits
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a number 'N'. The task is to find the Nth number whose each digit is a
 * prime number(<10) i.e 2, 3, 5, 7. In other words you have to find nth number
 * of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
 * Input
 * The first line contains a single integer T i.e. the number of test cases. The
 * first and only line of each test case consists of a single integer N.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 100000
 * Output
 * For each testcase print the nth number of the given sequence made of prime
 * digits in a new line.
 * Example
 * Input:
 * 2
 * 10
 * 21
 * 
 * Output:
 * 33
 * 222
 * 
 * Explanation:
 * Testcase 1: 10th number in the sequence of numbers whose each digit is prime
 * is 33.
 * Testcase 2: 21th number in the sequence of numbers whose each digit is prime
 * is 222.
 */