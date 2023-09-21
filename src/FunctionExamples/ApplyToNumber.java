package FunctionExamples;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface ApplyToNumber extends BiFunction<Integer, Integer, Integer> {
    public Integer apply(Integer number, Integer value);
}
