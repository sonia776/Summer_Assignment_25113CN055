public class Matrix_transpose {

    public static void main(String[] args) {

        int matrix1[][] = {
                { 7, 9, 4 },
                { 3, 12, 40 },
                { 2, 7, 0 }

        };

        int transpose[][] = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }

        // Transpose of matrix
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

}