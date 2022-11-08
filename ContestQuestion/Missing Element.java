import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int []x = new int[n-1];
       for(int i=0;i<n-1;i++){
           x[i]=sc.nextInt();
    }

    int a=x[0];
    for(int i=1;i<n-1;i++){
        a ^= x[i];
    }
    System.out.println(a);

    }
}
