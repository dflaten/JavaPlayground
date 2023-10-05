package HighLevelFunctionExamples;

public class AddFunction implements ApplyToNumber {

    @Override
    public Integer apply(Integer number, Integer val) {
        return number + val;
    }
}
