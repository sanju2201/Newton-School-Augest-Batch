public static Node intersection(Node head1,Node head2){
if(head1 == null || head2 == null){
    return null;
}
Node temp1 = head1;
Node temp2 = head2;

while(temp1!=temp2){
    if(temp1 == null){
        temp1 = head2;
    }
    else{
        temp1 = temp1.next;
    }

    if(temp2 == null){
        temp2 = head1;
    }
    else{
        temp2 = temp2.next;
    }
}
return temp1;
}
