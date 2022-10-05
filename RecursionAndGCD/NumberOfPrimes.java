package RecursionAndGCD;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfPrimes {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 ||
                n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 ||
                    n % (i + 2) == 0)
                return false;

        return true;
    }

    static void Prime(int n) {
        int ctr = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                ctr++;
        }
        System.out.println(ctr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Prime(n);
    }
}

/*
 * Number of primes
 * easy
 * Time Limit: 20 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a number n find the number of prime numbers less than equal to that
 * number.
 * Input
 * There is only one integer containing value of n.
 * 
 * Constraints:-
 * 1 <= n <= 10000000
 * Output
 * Return number of primes less than or equal to n
 * Example
 * Sample Input
 * 5
 * 
 * Sample Output
 * 3
 * 
 * Explanation:-
 * 2 3 and 5 are the required primes.
 * 
 * Sample Input
 * 5000
 * 
 * Sample Output
 * 669
 */
