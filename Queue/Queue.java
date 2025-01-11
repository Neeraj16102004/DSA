
public class Queue{
    private int front=0;
    private int rear=-1;
    private int size =0;
    private int[] arr = new int[4];
    public void enqueue(int data){
        if(!isFull()){
        rear = (rear+1)%4;
         arr[rear]=data;
         size++;}
         else 
             System.out.println("Queue is full...");
    }
    public int dequeue()
    {
       if(isEmpty())
           System.out.println("Queue is Empty...");
        else
        {int data = arr[front];
        front = (front+1)%4;
        size--;
        return data;}
        return 1;
    }
    
    public boolean isFull(){
        return size==4;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void show(){
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[(front+i)%4]+" ");
        }
        System.out.println(" ");
    }
    
    
    
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //System.out.println(queue.dequeue());
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        queue.enqueue(5);
        queue.enqueue(6);
        queue.show();
    }
}