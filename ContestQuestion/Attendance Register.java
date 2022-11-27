import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     HashMap<String, Integer> map = new HashMap<>();
     for(int i=0;i<n;i++){
         String s = sc.next();
         map.put(s,map.getOrDefault(s,0)+1);
     }
     int count =0;
     for(String key : map.keySet()){
         if(map.get(key)>1){
             count++;
         }
     }
     System.out.println(count);
    }
}
