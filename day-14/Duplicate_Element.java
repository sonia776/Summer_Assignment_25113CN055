public class Duplicate_Element {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 2, 4, 4, 9 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(" Duplicate element in an array is : " + arr[i]);
                    break;
                }

            }
        }
    }
}