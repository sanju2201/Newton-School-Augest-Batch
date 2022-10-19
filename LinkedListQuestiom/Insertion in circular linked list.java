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

public static Node Insertion(Node head, int K){
Node temp=head;
Node newNode = new Node(K);
while(temp.next!=head){
    temp=temp.next;
} 
temp.next = newNode;
newNode.next=head;     
return head;
}
