
public class Calculator {


    public int compute(int a, int b, BinaryOperation op) {
        return op.apply(a, b);

    }
}

