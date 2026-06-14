public class Reverse_Array {
     
     public static void main(String[] args) {
          int arr[] = {2,5,8,9,3};
          
          int start = 0 , end = arr.length -1 ;
     
          while (start<end) {
               int temp = arr[start];
               arr[start] = arr[end] ;
               arr[end] = temp ;

               start ++ ;
               end-- ;
          }
          
          for(int i = 0 ; i<arr.length  ; i++){
               System.out.print(arr[i] + " ");
          }
}
}