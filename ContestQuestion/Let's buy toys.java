import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a[] = new int[n];
     for(int i=0;i<n;i++){
         a[i] = sc.nextInt();
     }
      
    int left = 0;
    int right = n-1;
    int leftSum =0;
    int rightSum =0;
    int count1 =0;
    int count2 =0;
    int maxCount =0;

    while(left<right){
        if(count1 ==0 && count2 == 0){
            leftSum += a[left++];
            rightSum += a[right--];
            count1++;
            count2++;
           // System.out.println("1st");
        }

        if(leftSum < rightSum && left<right){
        leftSum += a[left++];
        count1++;
       // System.out.println("c1 "+count1);
        }

        if(rightSum < leftSum && left < right){
         rightSum += a[right--];
         count2++;
        // System.out.println("c2 "+count2);
        }

        if(leftSum == rightSum ){
            maxCount = Math.max(maxCount, count1+count2);
            leftSum += a[left++];
            rightSum += a[right--];
            count1++;
            count2++;
        }

    }
    System.out.println(maxCount);
    }
}

// https://my.newtonschool.co/playground/code/oxa3skxz9qos/
