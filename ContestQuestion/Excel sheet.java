import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static long rowOf(String s){
        long res = 0L;
        int mod = 1000000000+7;
        int n = s.length();
        for(int i=0;i<n;i++){
            res = (res*26)%mod;
            res += s.charAt(i)-'A'+1; 
        }
        return res%mod;
    }
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(rowOf(s));
    }
}
