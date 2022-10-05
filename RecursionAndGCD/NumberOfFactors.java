package RecursionAndGCD;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialDivisors(n));

    }

    static Vector<Integer> allPrimes = new Vector<Integer>();

    static void sieve(int n) {

        boolean[] prime = new boolean[n + 1];

        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {

            if (prime[p] == true) {

                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int p = 2; p <= n; p++)
            if (prime[p])
                allPrimes.add(p);
    }

    static long factorialDivisors(int n) {
        sieve(n);
        long result = 1;

        for (int i = 0; i < allPrimes.size(); i++) {
            long p = allPrimes.get(i);
            long exp = 0;
            while (p <= n) {
                exp = exp + (n / p);
                p = p * allPrimes.get(i);
            }
            result = result * (exp + 1);
        }
        return result;
    }

}

/*
 * Number of factors
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a integer N, your task is to calculate the number of divisors in
 * factorial of N.
 * Input
 * Input contains a single integer depicting value of N.
 * 
 * Constraints:-
 * 1 < = N < = 100
 * Output
 * Print the number of divisors in N!.
 * Example
 * Sample Input:-
 * 3
 * 
 * Sample Output:-
 * 4
 * 
 * Sample Input:-
 * 5
 * 
 * Sample Output:-
 * 16
 */