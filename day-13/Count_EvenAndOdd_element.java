import java.util.*;

public class Count_EvenAndOdd_element {

    public static void EvenandOdd(int arr[]) {

        int Evencount = 0, oddcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Even elements are : " + Evencount);
        System.out.println("Odd elements are : " + oddcount);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 5 array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        EvenandOdd(arr);

    }
}