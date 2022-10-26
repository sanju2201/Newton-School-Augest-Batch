/*
// information about the class Node
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
*/
static int getNthFromLast(Node head, int n)
{

  int len=0;
  Node temp=head;
  while(temp!= null){
      temp=temp.next;
      len++;
  }
//   if(len<n){
//       return;
//   }
  temp = head;
  for(int i=1;i<len-n+1;i++){
      temp =temp.next;
      //System.out.println(temp.data);
  }
  return temp.data;


       
}
