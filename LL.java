class LL { 
  Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
        this.data= data;
        this.next=null;
        }
    }
      //add first - Add Last are two types of add

      public void AddFirst(String data){
        Node newNode= new Node(data);
       if(head=null){
        head = newNode;
        return;
 }
 public void AddLast(String data){
        Node newNode= new Node(data);
       if(head=null){
        head = newNode;
        return;
 }
      Node CurrNode =head;
      while(currNode.nex )
       head= newNode;
      }



    public static void main(String[]args){
  LL list =new LL();
  
       list.AddLast("list");
       list.printList();


    }

    
}
 