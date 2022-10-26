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
 public static Node ReverseAlternateK(Node head,int k){
  Node cur = head;
  Node next = null;
  Node prev = null;
  int count = 0;

  while( cur!= null && count <k){
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
      count ++;
      
  }
  if( head != null){
      head.next = cur;
  }

  count =0;
  while(count <k-1 && cur!= null){
      cur = cur.next;
      count++;
  }

  if(cur != null){
      cur.next = ReverseAlternateK(cur.next , k);
  }
  return prev;
}
