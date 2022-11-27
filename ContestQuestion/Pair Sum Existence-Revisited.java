import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int target = sc.nextInt();
     int a[]= new int[n];
     for(int i = 0;i<n;i++){
         a[i]= sc.nextInt();
     }

     HashMap<Integer,Integer> map = new HashMap<>();
    
     for(int i=0;i<n;i++){
         if(map.containsKey(target-a[i])){
             System.out.println("1");
             return;
         }
         else{
             map.put(a[i],1);
         }
     }
     System.out.println("0");
     return;

    }
}

// https://my.newtonschool.co/playground/code/yvuat5g4ofcp/
