import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long arr[]= new long[n];
    int m= arr.length;
    int t = sc.nextInt();

    while(t-->0){
        int a=sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        for(int i=a-1;i<b;i++){
            arr[i] += c;
        }
    }
   long curSum = 0;
    long maxSum = Long.MIN_VALUE;
    for(int i=0;i<n;i++){
        curSum += arr[i];
        
        maxSum = Math.max(maxSum,curSum);
        if(curSum<0) {
            curSum =0;
        }
    }
    System.out.print(maxSum);
    
    }
    
}
