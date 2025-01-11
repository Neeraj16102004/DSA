package Stack;



public class Stack{
         public int[] arr = new int[6];
         public int size;
         int top;
         public Stack(){
            size = arr.length;
            top = -1;
         }
         public void push(int data){
            if(top<size)
            {
            arr[++top] = data;
            }
            else
                System.out.println("Stack Overflow...");
         }
        
         public int pop()
         {
            if(top>-1)
              return arr[--top] ;
            else
                System.out.println("Stack Underflow...");
              return 0; 
         }

        public int peek()
        {
            return arr[top];
        }

         public void printStack()
         {
            for(int n: arr)
            {
                System.out.print(n+" ");
            }
            System.out.println(" ");
         }

         public static void main(String[] args) {
            Stack num = new Stack();
            num.push(9);
            num.push(4);
            num.push(3);
            System.out.println(num.pop());
            num.push(2);
            num.push(1);
            num.printStack();
            System.out.println(num.peek());
        }


}