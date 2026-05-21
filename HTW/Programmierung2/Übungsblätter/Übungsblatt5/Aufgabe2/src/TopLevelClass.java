import java.util.function.IntUnaryOperator;

public class TopLevelClass implements IntUnaryOperator {
    @Override
    public int applyAsInt(int operand) {
        int ergebnis = 1;
        for(int k = operand; k>0; k--) {
            ergebnis *= k;
        }
        return ergebnis;
    }
}
