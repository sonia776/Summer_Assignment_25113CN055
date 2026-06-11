import java.util.*;

public class Input_display_Array{

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the array element ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        

        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }
}