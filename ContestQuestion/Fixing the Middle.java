import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int temp = n;
        n=(int)(Math.log(n)/Math.log(2)+1);
        if(n%2==0){
            int bit1 = (int)(n/2);
            int r=1<<(bit1-1);
            temp = temp^r;
            n = (int)(Math.log(temp)/Math.log(2)+1);
            int b = bit1+1;
            if(n%2==0){
                r=1<<(b-1);
            }
            else{
                r=1<<(b-2);
            }
            System.out.println(temp^r);
        }
        else{
            int bit1 = (int)(n/2)+1;
            int r=1<<(bit1-1);
            System.out.println(temp^r);
        }
    }
    }
}
