import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void printMaxWindowElement(int arr[], int n, int k){
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!deque.isEmpty() && arr[i]>arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for(int i=k;i<n;i++){
            System.out.print(arr[deque.peekFirst()]+" ");

            // remove non window Element
            while(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.removeFirst();
            }

            // removing already present useless Element
            while(!deque.isEmpty() && arr[i]> arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
           
        }
         System.out.print(arr[deque.peekFirst()]+" ");
       
    }
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    printMaxWindowElement(arr,n,k);
    }
}

// https://my.newtonschool.co/playground/code/9170weaawpo8/
