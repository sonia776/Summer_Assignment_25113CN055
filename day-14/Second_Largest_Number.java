public class Second_Largest_Number {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 1, 8, 1, 4 };
        int largest = Integer.MIN_VALUE, secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        System.out.println("Second Largest Element = " + secondlargest);
    }

}