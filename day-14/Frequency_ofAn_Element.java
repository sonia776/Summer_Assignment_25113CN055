public class Frequency_ofAn_Element {

    public static int frequency(int arr[], int key) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 1, 8, 1, 4 };
        int key = 1;

        System.out.println("Frequency of " + key + " is : " + frequency(arr, key));
    }

}