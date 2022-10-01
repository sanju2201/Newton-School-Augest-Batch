package divide_conquer;

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
