public class UnionOf_Two_Arrays {

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 4, 2, 6, 7, 3 };

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        for (int j = 0; j < arr2.length; j++) {

            boolean isFound = false;

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[j]) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.print(arr2[j] + " ");
            }

        }

    }
}
