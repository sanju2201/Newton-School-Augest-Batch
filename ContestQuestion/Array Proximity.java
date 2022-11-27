import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     long arr[] = new long[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     int left =0;
     int right = left+1;
     long maxProduct =arr[left]*arr[right];
     while(right<n-1){
         left++;
         right++;
         maxProduct = Math.max(maxProduct,arr[left]*arr[right]);
    
     }
     System.out.println(maxProduct);
    }
}
