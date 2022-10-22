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

public static Node deleteMiddleElement(Node head) {
		int count =0;
        Node temp =head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1){
            head.val =-1;
            return head;
        }
        count = count/2;
        int i=1;
        temp =head;
        while(i!=count){
            temp=temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
