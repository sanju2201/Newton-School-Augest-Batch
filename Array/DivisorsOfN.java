package Array;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DivisorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i == n / i && i % 2 == 0) {
                        count++;
                    } else {
                        if (i % 2 == 0) {
                            count++;
                        }
                        if ((n / i) % 2 == 0) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
            t--;
        }

    }
}

/*
 * Divisors Of N
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer N, the task is to find the number of divisors of N which are
 * divisible by 2.
 * Input
 * The input line contains T, denoting the number of testcases. First line of
 * each testcase contains integer N
 * 
 * Constraints:
 * 1 <= T <= 50
 * 1 <= N <= 10^9
 * Output
 * For each testcase in new line, you need to print the number of divisors of N
 * which are exactly divisble by 2
 * Example
 * Input:
 * 2
 * 9
 * 8
 * 
 * Output
 * 0
 * 3
 */