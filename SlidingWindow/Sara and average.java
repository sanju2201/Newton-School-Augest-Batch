import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int w = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }

     int i=0;
     int sum =0;
     while(i<w){
         sum+=arr[i];
         System.out.print(sum/(i+1)+" ");
         i++;
     }

     for(i=w;i<n;i++){
         sum = sum+arr[i]-arr[i-w];
         System.out.print(sum/w+" ");
     }
    }
}

// https://my.newtonschool.co/playground/code/4c1cvu58up6f/
