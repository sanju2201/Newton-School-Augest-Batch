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
    int h[] = new int[n];
    // Taking Inputs
    for(int i = 0;i<n;i++){
        h[i] = sc.nextInt();
    }

    int ans[] = new int[n];
    for(int i=0;i<n;i++){
        ans[i] = h[i];
    }

    Arrays.sort(ans);
   int count =0;
    for(int i=0;i<n;i++){
        if(ans[i] !=h[i]){
            count++;
        }
    }    
     if(count > 2){
         System.out.println("NO");
     }
     else{
         System.out.println("YES");
     }
    }
    
    }
}
