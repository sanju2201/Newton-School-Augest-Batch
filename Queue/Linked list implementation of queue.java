class Queue
{
 private Node front, rear; 
 private int currentSize;
 
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
    
 public Queue()
 {
 front = null;
 rear = null;
 currentSize = 0;
 }
 
 
 public void dequeue()
 {
   if(currentSize!=0){
       front = front.next;
       currentSize--;
   }
 }
 

 public void enqueue(int data)
 {
 Node newNode = new Node(data);
 if(currentSize ==0){
   front = newNode;
 }
 else{
   rear.next = newNode;
 }
 rear = newNode;
 currentSize++;
 }
 
 public void displayfront(){
     if(currentSize==0){
       System.out.println(0);
   }
   else{
        System.out.println(front.val);
   }
 }
}

// https://my.newtonschool.co/playground/code/by86no5928cq/
