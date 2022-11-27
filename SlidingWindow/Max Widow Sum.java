import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void maxInEveryWindow(int arr[], int n,int d){
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0;i<d;i++){
            // remove already present useless element
            while(!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        long sum = 0;
        for(int i=d;i<n;i++){
            sum += arr[deque.peekFirst()];  // add previous window max to ans

            // removing non window element
            while(!deque.isEmpty() && deque.peekFirst() <= i-d){
                deque.removeFirst();
            }

            // remove already present useless element
            while(!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }

            deque.addLast(i);
        }
        sum += arr[deque.peekFirst()];
        System.out.println(sum);
    }
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int d = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     maxInEveryWindow(arr,n,d);
    }
}

// https://my.newtonschool.co/playground/code/sn0vig2yr55d/
