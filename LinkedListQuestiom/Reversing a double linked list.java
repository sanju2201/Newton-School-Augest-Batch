/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
    if(head.next == null){
      return head;
    }

Node ptr1 = head;
Node ptr2 = head.next;
 ptr1.next = null;
 ptr1.prev = ptr2;

 while(ptr2!=null){
   ptr2.prev = ptr2.next;
   ptr2.next = ptr1;
   ptr1 = ptr2;
   ptr2 = ptr2.prev;

 }
 head = ptr1;
 return head;
}
