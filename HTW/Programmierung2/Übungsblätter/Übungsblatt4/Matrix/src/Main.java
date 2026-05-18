public class Main {
    public static void main(String[] args) {
        Matrix<Double> matrix1 = new Matrix<>(3, 4);
        Matrix<Double> matrix2 = new Matrix<>(3, 4);
        Double[][] values = {
                {1.0, 2.0, 3.0, null},
                {12.0, 13.5, 5.5, 6.6},
                {5.5, 7.7, 5.9, 13.9}
        };

        Double[][] values2 = {
                {1.0, 2.0, 3.0, 4.0},
                {12.0, 13.5, 5.5, 6.6},
                {5.5, 7.7, 5.9, 13.9}
        };


        for (int i = 0; i < values2.length; i++) {
            for (int j = 0; j < values2[i].length; j++) {
                matrix1.setElement(i, j, values2[i][j]);
            }
        }


            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < values[i].length; j++) {
                    matrix2.setElement(i, j, values[i][j]);
                }
            }

            Matrix<Double> result = matrix1.multiplyMatrixByNumber(77);
            Matrix<Double> result2 = result.addTwoMatrix(matrix2);

            System.out.println("MATRIX 1: ");
            System.out.println(result.toString());
            System.out.println("MATRIX 2: ");
            System.out.println(matrix2.toString());
            System.out.println("MATRIX 1+2: ");
            System.out.println(result2.toString());

    }
}