public class Descending_Sorted_Array {

    public static void BubblesortDescending(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int arr[]) {
        System.out.println("Sorted array in descending order : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 7, 5, 9, 2 };
        BubblesortDescending(arr);
        print(arr);

    }

}