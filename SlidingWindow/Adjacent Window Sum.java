import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   
    public static void adjacentWindowSum(int arr[],int n,int k,int target){
     int firstWindow =0;
     int secondWindow =0;

     for(int i=0;i<k;i++){
         firstWindow += arr[i];
     }

     for(int i=k;i<n;i++){
         secondWindow = firstWindow -arr[i-k]+ arr[i];
         if(firstWindow+secondWindow == target){
             System.out.println("YES");
             return;
         }
         else{
             firstWindow = secondWindow;
         }
     }
     System.out.println("NO");
    }
     public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int target = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    adjacentWindowSum(arr,n,k,target);
    }
}

// https://my.newtonschool.co/playground/code/ls907mbx49yy/
