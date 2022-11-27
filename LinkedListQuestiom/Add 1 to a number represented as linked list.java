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

  static Node addOne(Node head){
// return the head of the modified linked list
Node dummy = new Node(1);
Node temp = dummy;
Node ptr = head;
Node newNode = new Node(1);
int sum=0;
int carry =0;
int count =0;
while(ptr !=null || carry != 0){
     sum =0;
     if(ptr != null){
       sum += ptr.data;
       ptr = ptr.next;
       count++;
     }
     if(count==1)
     sum += newNode.data;

     sum += carry;

     carry = sum/10;
     Node res = new Node(sum%10);
     temp.next = res;
     temp = temp.next;
}
return dummy.next;
}

//  https://my.newtonschool.co/playground/code/u4mjrds0gmko/
