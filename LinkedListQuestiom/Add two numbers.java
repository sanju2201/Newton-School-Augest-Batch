/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/
static Node head;
static void addLast(int data){
  Node newNode =new Node(data);
  if(head == null){
    head =newNode;
    return;
  }
  Node ptr= head;
  while(ptr.next != null){
    ptr = ptr.next;
  }
  ptr.next = newNode;
}

  static Node addNumber(Node first, Node second){
// return the head of the modified linked list
int sum=0, leftSumVal =0;
while(first != null && second != null){
  sum = (first.data + second.data + leftSumVal)%10;
  leftSumVal = (first.data + second.data + leftSumVal)/10;
  addLast(sum);
  first = first.next;
  second = second.next;
}
while(first != null){
  sum = (first.data + leftSumVal)%10;
  leftSumVal = (first.data + leftSumVal)/10;
  addLast(sum);
  first = first.next;
}
while(second != null){
  sum = (second.data + leftSumVal)%10;
  leftSumVal = (second.data + leftSumVal)/10;
  addLast(sum);
  second = second.next;
}
while(leftSumVal !=0){
  addLast(leftSumVal%10);
  leftSumVal = leftSumVal/10;
}
return head;

}
