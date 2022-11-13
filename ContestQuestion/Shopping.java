import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int p[] = new int[n];
    for(int i=0;i<n;i++){
        p[i] = sc.nextInt();
    }

    Arrays.sort(p);
    long cost = 0;
    if(n<k+2){
        System.out.println(0);
    }
    else{
    for(int i=2;i<k+2;i++){
        cost = cost+p[i];
    }
    System.out.println(cost);
    }
    }
}
