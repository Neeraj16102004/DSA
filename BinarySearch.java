public class BinarySearch{
    public static void main(String[] args) {
        int[] num ={23,33,44,12,1,34,56};
        int target = 11;
        int result = binarysearch(num,target);
         if(result!=-1)
            System.out.println("Element is found at " + result);
            else
            System.out.println("Element not found");
    }
        
            public static int binarysearch(int[] num, int target) {
               int beg =0;  int end = num.length -1;
              while(beg<=end){ 
                int mid = (beg+end)/2;
            
             if(num[mid]==target)
               return mid;
            else if(num[mid]<target)
                beg = mid+1;
            else
                end = mid-1;
             }
           
           return -1;
            }

        }