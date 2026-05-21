import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public interface MyFunction extends IntUnaryOperator {

    default MyFunction conditionalInput(IntPredicate predicate) {
        return x -> predicate.test(x)? applyAsInt(x): 0;
    }

    default MyFunction conditionalOutput(IntPredicate predicate) {
        return x -> predicate.test(applyAsInt(x))? applyAsInt(x): 0;
    }
}
