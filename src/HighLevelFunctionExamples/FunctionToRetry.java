package HighLevelFunctionExamples;

import java.util.function.Function;

public interface FunctionToRetry extends Function<Integer, Void>{
    public Void apply(Integer attempts);
}
