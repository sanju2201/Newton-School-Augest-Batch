import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i =0;i<n;i++){
        a[i] = sc.nextInt();
    }

    Deque<Integer> deque = new LinkedList<>();
    deque.add(a[0]);
    for(int i=1;i<n;i++){
        if(a[i]>=deque.getFirst()){
            deque.addFirst(a[i]);
        }
        else{
            deque.addLast(a[i]);
        }
    }

    Iterator itr = deque.iterator();
    while(itr.hasNext()){
        System.out.print(itr.next()+" ");
    }
    
    }
}
