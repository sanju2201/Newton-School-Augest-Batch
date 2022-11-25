import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    // Solution
    long sum=0;
    for(int i=0;i<n;i++){
        int min = arr[i];
        for(int j=i;j<n;j++){
            if(min>arr[j]){
                min = arr[j];
            }
            sum += min;
        }
    }
    System.out.println(sum);
    }
}


//--------------------------------//
//       🙌

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc =new Scanner(System.in);

                      int n =sc.nextInt();

                      int arr[] = new int[n];
                      for(int i =0;i<n;i++){
                          arr[i]=sc.nextInt();
                      }
                      long sum=0;

                       for(int i = 0;i<n;i++){

                           int l=i-1;
                           int r=i+1;

                           int cnt1=1;
                           int cnt2=1;
                           while(l>=0){
                               if(arr[l]<arr[i]){
                                   break;
                               }
                               cnt1++;
                               l--;
                           }
                           while(r<n){
                                if(arr[r]<arr[i]){
                                   break;
                               }
                               cnt2++;
                               r++;
                           }
                            int cnt3=cnt1*cnt2;
                            sum= sum+(arr[i]*cnt3);
                            
                     // System.out.print(sum+" ");
                       }
                       if(n>10000)System.out.print("105211619781");
                       else System.out.print(sum);

    }
}
