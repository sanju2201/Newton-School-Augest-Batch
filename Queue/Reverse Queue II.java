import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int x= q.remove();
        reverseQueue(q);
        q.add(x);

    }

    public static void reverseQueueKFirstElement(Queue<Integer> Q , int k){
        int n = Q.size();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<k;i++){
            q.add(Q.remove());
        }

        reverseQueue(q);

        for(int i=0;i<k;i++){
            Q.add(q.remove());
        }
        for(int i=0;i<n-k;i++){
            Q.add(Q.remove());
        }


    }
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    Queue<Integer> queue = new LinkedList<>();
    for(int i=0;i<n;i++){
        queue.add(sc.nextInt());
    }
    reverseQueueKFirstElement(queue,k);

    for(int i=0;i<n;i++){
        System.out.print(queue.remove()+" ");
    }

    }
    
}

  /// https://my.newtonschool.co/playground/code/zj4rctn6y52q/
