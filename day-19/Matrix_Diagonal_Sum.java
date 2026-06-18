public class Matrix_Diagonal_Sum {

    public static void main(String[] args) {

        int matrix1[][] = {
                { 7, 9, 4 },
                { 3, 12, 40 },
                { 2, 7, 0 }

        };

        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            sum += matrix1[i][i];

            if (i != matrix1.length - 1 - i) {
                sum += matrix1[i][matrix1.length - 1 - i];
            }
        }

        System.out.print("Diagonal Sum : " + sum);

    }

}
