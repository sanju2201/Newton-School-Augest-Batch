package ModuloArithmatics;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ModularExponentiation {
    public static int powerOfTwo(int x, int y) {
        int ans = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                ans = ans * x;
            }
            y = y / 2;
            x = x * x;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > 30) {
            System.out.println(m);
            return;
        }
        int power = powerOfTwo(2, n);
        System.out.println(m % power);
    }
}

/*
 * Modular Exponentiation
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given integers n and m, calculate: mMOD(2n)
 * Input
 * The first line contains a single integer n (1 ≤ n ≤ 108).
 * The second line contains a single integer m (1 ≤ m ≤ 108).
 * Output
 * Output a single integer — the value of m MOD 2n
 * Example
 * Sample Input
 * 4
 * 42
 * 
 * Sample Output
 * 10
 */