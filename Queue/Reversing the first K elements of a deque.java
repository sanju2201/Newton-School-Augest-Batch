import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     Deque<Integer> deque = new ArrayDeque<>();
     Deque<Integer> deq = new ArrayDeque<>();

     for(int i=0;i<n;i++){
        deque.addLast(sc.nextInt());
     }
     for(int i=0;i<k;i++){
         deq.addLast(deque.removeFirst());
     }

     while(!deq.isEmpty()){
         deque.addFirst(deq.removeFirst());
     }

     for(int i=0;i<n;i++){
         System.out.print(deque.removeFirst()+" ");
     }  
    }
}

// https://my.newtonschool.co/playground/code/xukioxkzdra5/
