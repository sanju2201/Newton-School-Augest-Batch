import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int d = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     
      int sum =0;

      // taking 1st Window
      for(int i=0;i<d;i++){
          sum +=arr[i];
      }

      // checking sum is == 0 or not
      if(sum == 0){
          System.out.println(1);
          return;
      }

      // now checking next all window
        for(int i=d;i<n;i++){
            sum = sum-arr[i-d] +arr[i];
            if(sum ==0){
                System.out.println(i-d+2);
                return;
            }
        }
        System.out.println(-1);
    }
}

// https://my.newtonschool.co/playground/code/uk6wxjyj65f8/
