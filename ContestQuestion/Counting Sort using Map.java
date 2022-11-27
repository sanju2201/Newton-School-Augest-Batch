import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[]arr = new int[n];

            for(int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }

           HashMap<Integer, Integer> map = new HashMap<>();

           for(int i = 0; i < n; i++){
               map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
           }
           for(int i = 1; i < 100001; i++){
               if(map.containsKey(i)){
                   System.out.print(i + " ");
               }
           }
            System.out.println();
            
        }
    }
}

// 2nd Solution without map



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    }
}

// https://my.newtonschool.co/playground/code/pkzm3gmq3p3h/
