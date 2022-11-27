/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k ,int pos ) {
Node newNode = new Node(k);
Node temp =head;

if (pos == 1) {
  newNode.next= head;
  head = newNode;
  return head;
  } 
   else {
     int count =1;
    while(count<pos-1){
    temp = temp.next;
    count++;
}
newNode.next = temp.next;
temp.next = newNode;
}
return head;
}
