public class QuickSort {
    
    public static void main(String[] args) {
        int[] arr = {10,43,34,7,23,56,2,1};
       
       for(int num: arr){
         System.out.print(num+ " ");
       }
       System.out.println("Before Sorting...");
       System.out.println(" ");
       quickSort(arr,0,arr.length-1);
           
    
  }
    
    

        
            public static void quickSort(int[] arr, int low, int high) {
                
              if(low<high){
                int piv = partition(arr,low,high);
                  quickSort(arr, low, piv-1);
                  quickSort(arr, piv+1, high);           
                  for(int num: arr){
                    System.out.print(num +" ");
                }
                 System.out.println(" ");
                }

        }
             public static int partition(int[] arr, int low, int high) {
             int pivot = arr[high];
             int i = low - 1;
             for(int j=low;j<high;j++){
                 if(arr[j]<pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
             }         
             int temp = arr[i+1];
             arr[i+1] = arr[high];
             arr[high] = temp;  
             
             return i+1;            
        }
}
