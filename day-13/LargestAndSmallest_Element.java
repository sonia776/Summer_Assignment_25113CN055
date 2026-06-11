import java.util.*;

public class LargestAndSmallest_Element {


    public static int largestElement(int arr[]){

        int LargestNo = Integer.MIN_VALUE;
    
        for(int i = 0 ; i<arr.length ; i++){
            if (LargestNo <arr[i]) {
                LargestNo = arr[i] ;
            }

        }

           return LargestNo ;
    }


    public static int smallestElement(int arr[]){

        int smallestNo = Integer.MAX_VALUE;
    
        for(int i = 0 ; i<arr.length ; i++){
            if (smallestNo > arr[i]) {
                smallestNo = arr[i] ;
            }

        }

           return smallestNo ;
    }

    
       public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 5 array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest element is : " + largestElement(arr));
        System.out.println("Smallest element is : " + smallestElement(arr));

    }
}