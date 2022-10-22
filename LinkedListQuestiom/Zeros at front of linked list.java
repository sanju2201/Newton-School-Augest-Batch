/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
  Node ptr=head;
  while(ptr.next!=null){
      if(ptr.next.data==0){
          ptr.next = ptr.next.next;
          Node newNode =new Node(0);
          newNode.next =head;
          head = newNode;
      }
      else{
          ptr =ptr.next;
      }
  }
  return head;
}
