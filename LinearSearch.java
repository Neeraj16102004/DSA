public class LinearSearch{
    public static void main(String[] args) {
        int[] num = {12,34,22,10,5,45};
        int target= 34; 
        int result = linearsearch(num,target);
        if(result!=-1)
           System.out.println("Element found at " + result);
        else 
           System.out.println("Element notfound.");
                          
                 }
        
            public static int linearsearch(int[] num, int target) {
                for(int i=0;i<num.length;i++){
                    if(num[i]==target)
                    return i;
               }
                 return -1;
            }
         
         
             }
         
            
