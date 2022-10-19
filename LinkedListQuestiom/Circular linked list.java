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

public static int check(Node head) {
Node temp= head.next;
while(temp != null && temp!= head){
    temp=temp.next;
}
if(temp==head)
return 1;
else
return 0;
}
