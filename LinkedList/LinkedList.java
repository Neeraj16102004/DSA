package LinkedList;




public class LinkedList {
       Node head = null;
      public void add(int data){
          Node newNode = new Node(data);
          Node current = head;
          if(head==null)
           head = newNode;
          else{
              while(current.next!= null)
                  current =current.next;
              current.next = newNode;
          }
      }
  public void printValues(){
          Node current = head;
          while(current!=null)
          {
              System.out.print(current.data + " ");
              current = current.next;
          }
          System.out.println(" ");
  }

  public static void main(String[] args){
          LinkedList num = new LinkedList();
          num.add(5);
          num.add(3);
          num.add(2);

         num.addFirst(7);
         num.delete(3);

          num.printValues();

  }

    private void delete(int data) {
              Node current = head;
              while(current.next!=null && current.next.data!=data){
                  current=current.next;
              }
              if(current.next!=null){
                  current.next = current.next.next;
              }
      }

    public void addFirst(int data) {
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
      }


}


