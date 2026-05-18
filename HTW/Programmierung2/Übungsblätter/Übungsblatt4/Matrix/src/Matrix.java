
public class Matrix<T extends Number> {
    private int rows;
    private int columns;
    private Number[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new Number[rows][columns];
    }

    public Number getElement(int row, int column) {
        if (row < 0 || column < 0 || row >= rows || column >= columns) {
            throw new IndexOutOfBoundsException("Ungültiger Row or Column");
        }
        return data[row][column];
    }

    public void setElement(int row, int column, T value) {
        if (row < 0 || column < 0 || row >= rows || column >= columns) {
            throw new IndexOutOfBoundsException("Ungültiger Row or Column");
        }
        data[row][column] = value;
    }


    public Matrix<Double> addTwoMatrix(Matrix<? extends Number> matrix) {
        if (matrix.rows != rows || matrix.columns != columns) {
            throw new IllegalArgumentException("Matrix dimensions do not match");
        }
        Matrix<Double> result = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(this.data[i][j] == null || matrix.data[i][j] == null) {
                    result.setElement(i,j, null);
                }else{
                    double value = matrix.getElement(i, j).doubleValue() + this.getElement(i, j).doubleValue();
                    result.setElement(i, j, value);
                }
            }
        }
        return result;
    }

    public Matrix<Double> multiplyMatrixByNumber(Number number) {
        Matrix<Double> result = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(data[i][j] == null || number == null) {
                    result.setElement(i,j, null);
                }else{
                    double value = this.getElement(i, j).doubleValue() * number.doubleValue();
                    result.setElement(i, j, value);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Number value = this.getElement(i, j);
                if (value == null) {
                    result += "null";
                }else{
                    result += value.toString();
                }
                if (j == columns - 1) {
                    result += "\n";
                } else {
                    result += " " + "| ";
                }
            }
        }
        return result;
    }

}

/*

data= {
{1,2,3,4}
{5,6,7,8}

};
 */
