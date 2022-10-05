package BasicsOfProgramming;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Integer Long float Double char
        int a = sc.nextInt();
        long b = sc.nextLong();
        float c = sc.nextFloat();
        double d = sc.nextDouble();
        char e = sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.format("%.2f\n", c);
        System.out.format("%.4f\n", d);
        System.out.println(e);
    }
}

/*
 * 2312351235
 * 1.21
 * 543.1321
 * c
 * 
 * Sample Output:-
 * 2
 * 2312351235
 * 1.21
 * 543.1321
 * c
 */
