public class SelectionSort {
    public static void main(String[] args) {
        int num[]={23,12,34,5,6,78};
        int size = num.length;
        int temp =0;
        int minindex =0;
     System.out.println("before sorting");
     for(int n:num){
        System.out.print(n + " ");
       }
      System.out.println();

     for(int i=0;i<size-1;i++){
        minindex =i;
        for(int j=i;j<size;j++){
            if(num[minindex]>num[j])
               minindex =j;
        }
            temp = num[minindex];
            num[minindex]=num[i];
            num[i]=temp;
            for(int n:num){
                
                System.out.print(n + " ");
               }
               System.out.println();
        }




        System.out.println();
     System.out.println("after sorting");
     for(int n:num){
        System.out.print(n + " ");
     }
    }
}
