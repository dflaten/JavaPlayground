package FunctionExamples;

import FunctionExamples.ApplyToNumber;

public class MultiplyFunction implements ApplyToNumber {

    @Override
    public Integer apply(Integer number, Integer val) {
        return number * val;
    }
}
