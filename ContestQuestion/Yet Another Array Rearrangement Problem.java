import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void minArray(int arr[] , int n){
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        else{
            int left = 0;
            int right = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%2==1){
                    left++;
                }
                else{
                    right++;
                }
            }

            if(left>0 && right>0){
                Arrays.sort(arr);
            }


            // while(left<n){
            // while(right<n){
            //     if((arr[left]+arr[right])%2==1  && arr[left]>arr[right]){
            //         int temp = arr[left];
            //         arr[left] = arr[right];
            //         arr[right] = temp;
            //         right++;
            //     }
            //     else{
            //         right++;
            //     }
            // }
            // left++;
            // right = left+1;
            // }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     minArray(arr,n);
    }
}

// https://my.newtonschool.co/playground/code/qzn3moagj50j/
