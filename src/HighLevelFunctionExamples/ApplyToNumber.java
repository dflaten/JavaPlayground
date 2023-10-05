package HighLevelFunctionExamples;

import java.util.function.BiFunction;

public interface ApplyToNumber extends BiFunction<Integer, Integer, Integer> {
    public Integer apply(Integer number, Integer value);
}
