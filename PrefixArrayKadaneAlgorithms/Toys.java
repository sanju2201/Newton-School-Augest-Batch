import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int a[] = new int [n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    while(q-->0){
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            n=n-k;
        }
        System.out.println(sum);
        sum=0;
        n=a.length;
    }
    
    }
}
