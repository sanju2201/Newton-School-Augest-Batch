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
     int ans[] = new int[n];
     //Stack<Integer>stack = new Stack<>();
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0;i<n;i++){
         if(map.containsKey(a[i])){
             map.put(a[i],map.get(a[i])+1);
         }
         else{
             map.put(a[i],1);
         }    
     }

     for(int i=0;i<n;i++){
         boolean flag = true;
         for(int j=i+1;j<n;j++){
             if(map.get(a[i])<= map.get(a[j])){
                 System.out.print((j+1)+" ");
                 flag = false;
                 break;
             }
         }
         if(flag){
             System.out.print(-1+" ");
         }
     }

    }
}

// https://my.newtonschool.co/playground/code/nsuqnlkcplj5/
