import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    answer(a);
    // for(int i=0;i<n;i++){
    //     System.out.print(a[i]+" ");
    // }

    }
    public static void answer( int[]a){
    HashMap<Integer,Integer> map= new HashMap<>();
    int n=a.length;
    for(int i=0;i<n;i++){
        if(!map.containsKey(a[i])){
            map.put(a[i],1);
        }
        else{
            map.put(a[i],map.get(a[i])+1);
        }
    }
    List<Integer> list=new ArrayList<>(map.keySet());
    Collections.sort(list,(c,b) ->{ 
        return (map.get(c) ==map.get(b)) ? b-c : map.get(c)-map.get(b);
    });

    int []res =new int[a.length];
    int i=0;
    for(int num : list){
        for(int j=0;j<map.get(num); j++){
            res[i++]=num;
        }
    }
    for(int k=0;k<n;k++){
        System.out.print(res[k]+" ");
    }
    
    
    }
}
