import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//9,45,165,495,1287,3003 series----> (n+8)Cn
class Main {
    static int p=1000000007;
    static long x,y;
    static long moduloMultiply(long a, long b)
    {
        long res=((a%p)*(b%p))%p;
        return res;
    }
    static long gcdExtended(long a, long b)
    {
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }
        long gcd = gcdExtended(b % a, a);
        long x1 = x;
        long y1 = y;
        x = y1 - (b / a) * x1;
        y = x1;
        return gcd;
    }
    static long modInverse(long a)
    {
        long g = gcdExtended(a, p);
        if (g != 1)
            return -1;
        return (x%p +p)%p;
    }
    static long modDivide(long a, long b)
    {
        a = a % p;
        long inv = modInverse(b);
        if (inv == -1)
            return 0;
        else
            return (inv*a) % p;
    }
    static long nCr(long n, long r)
    {
        if (r>n)
            return 0;
        if (r>n-r)
            r=n-r;
        long x = 1;
        for (long i=1L;i<=r;i++) {
            x=moduloMultiply(x% p, (n + 1L - i));
            x=modDivide(x% p, i);
        }
        return x;
    }
    public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            long n=sc.nextLong();
            long max=2147483647;         //range of int
            if(n>max)
             n=max;
            System.out.print(nCr(n+8,n));
    }
}
