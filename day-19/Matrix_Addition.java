public class Matrix_Addition {

    public static void main(String[] args) {

        int matrix1[][] = {
                { 2, 1, 4 },
                { 5, 0, 3 }

        };

        int matrix2[][] = {
                { 7, 9, 4 },
                { 3, 12, 40 }

        };

        int matrix3[][] = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // summation of matrix1 and matrix2
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

    }

}