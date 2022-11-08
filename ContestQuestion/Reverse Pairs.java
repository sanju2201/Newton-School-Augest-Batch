import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    

    public static int mergeSort(int arr[], int left, int right){
        if(left>=right)
        return 0;

            int mid = left+(right-left)/2;
           int res =  mergeSort(arr,left,mid) + mergeSort(arr,mid+1,right);

            int j=mid+1;
            for(int i=left;i<=mid;i++){
                while(j<=right && arr[i]/2.0> arr[j]){
                    j++;
                }
                res += j-(mid+1);       

            }
            Arrays.sort(arr,left,right+1);
            return res;
 
    }

    public static int reversePair(int arr[]){
        int n= arr.length;
        if(arr==null || n==0){
            return 0;
        }
        return mergeSort(arr,0,n-1);
     }

    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }

    int pair = reversePair(arr);
    System.out.println(pair);
    }
}
