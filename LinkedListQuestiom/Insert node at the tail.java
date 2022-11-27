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

public static Node addElement(Node head, int k) {
Node newNode = new Node(k);
if(head == null){
    head = newNode;
    return head;
}
if(head.next == null){
    head.next = newNode;
    return head;
}
Node temp = head;
while(temp.next !=null){
    temp = temp.next;
}
temp.next = newNode;
return head;
}

// https://my.newtonschool.co/playground/code/5g35z7wbq72t/
