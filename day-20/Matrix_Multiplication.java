public class Matrix_Multiplication {
    public static void main(String[] args) {

        int A[][] = {
            {5, 0, 3},
            {2, 5, 4}
        };

        int B[][] = {
            {7, 8},
            {6, 3},
            {1, 12}
        };

        int C[][] = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Product of  Matrix is :");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}