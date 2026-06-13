public class Linear_Search {

    public static int linearSearch(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 1, 8, 9, 2 };
        int target = 9;

        if (linearSearch(arr, target) == -1) {
            System.out.println("Target is not found in the array ");
        } else {

            System.out.println("Target is at index : " + linearSearch(arr, target));

        }

    }

}