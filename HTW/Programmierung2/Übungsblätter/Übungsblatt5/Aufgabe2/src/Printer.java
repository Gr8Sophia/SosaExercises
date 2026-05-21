import java.util.function.IntUnaryOperator;

public class Printer {
    public static void applyAndPrint(int i, int j, IntUnaryOperator operator) {
        for(int k = i; k<=j; k++ ) {
            System.out.print(operator.applyAsInt(k) +" ");
        }
    }
}
