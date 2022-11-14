import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int brr[] = new int[n-1];
    // input for 1st Array
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    // input for 2nd Array
        for(int i=0;i<n-1;i++){
        brr[i] = sc.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    int i=0;
    int j=0;
    while(i<n){
        stack.push(arr[i]);
        if(stack.peek()==brr[j]){
            stack.pop();
            i++;
            j++;
        }
        else{
            i++;
        }
    }

    // Print the Stack
    if(stack.size()>1){
        System.out.println("NO");
    }
    else{
        System.out.println("YES");

    }


    }

}
