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
  static Node addNumber(Node first, Node second){
// return the head of the modified linked list
        Node prev = new Node(0);
        Node head = prev;
        int carry = 0;
        while (first != null || second != null || carry != 0) {
            Node cur = new Node(0); 
            int sum = ((second == null) ? 0 : second.data) + ((first == null) ? 0 : first.data) + carry;
            cur.data = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;
            
            first = (first == null) ? first : first.next;
            second = (second == null) ? second : second.next;
        }
        return head.next;
}
