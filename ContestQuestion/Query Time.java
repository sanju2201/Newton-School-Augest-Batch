import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int arr[]=new int[n+1];
     for(int i=0; i<n; i++)
     {
        
       int x= sc.nextInt();
          arr[x]++;
     }
     for(int i=1; i<=n; i++)
     {
         arr[i]=arr[i]+arr[i-1];
     }
    while(q-->0){
        int l=sc.nextInt();
        int r=sc.nextInt();
         System.out.println(arr[r]-arr[l-1]);
   }
}
}
