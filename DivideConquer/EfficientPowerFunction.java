package DivideConquer;

public class EfficientPowerFunction {

    // funtionalProblem
    public long power(long a, long n) {
        if (n == 0)
            return 1;

        long M = (long) 1e9 + 7;

        long p = power(a, n / 2);
        p = (p * p) % M;

        if (n % 2 == 1) {
            p = (p * a) % M;
        }

        return p;
    }
}

/*
 * Efficient power function
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Implement the power(a, n) function which return the value an in log(n) time
 * complexity.
 * 
 * The value can be very large so return the answer with modulo M=1e9+7.
 * Input
 * You don't have to input anything, just implement the function.
 * 
 * Constraints :
 * -10^9 <= a <= 10^9, a!=0
 * 0 <= n <= 10^9
 * Output
 * You don't have to output anything, just return the required value.
 * Example
 * Input:
 * 2 0
 * 
 * Output:
 * 1
 * 
 * Input:
 * 3 4
 * 
 * Output:
 * 81
 * 
 * Input:
 * -5 3
 * 
 * Output:
 * -125
 */
