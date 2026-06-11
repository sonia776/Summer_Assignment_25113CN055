import java.util.*;

public class Sum_and_Average {

    
    public static int Sum_avg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    
    public static double average(int arr[]) {
        int sum = Sum_avg(arr); 
        return (double) sum / arr.length; 
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 5 array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int totalSum = Sum_avg(arr);
        double totalAvg = average(arr);

        System.out.println("Sum of elements: " + totalSum);
        System.out.println("Average of elements: " + totalAvg);

    }
}