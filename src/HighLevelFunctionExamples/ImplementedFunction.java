package HighLevelFunctionExamples;

public class ImplementedFunction implements FunctionToRetry {
    public Void apply(Integer attempts){
        if (attempts < 2) {
            System.out.println("Attempt number: " + attempts + " Error!");
            throw new RuntimeException("Error!");
        } else {
            System.out.println("Attempt number: " + attempts + " Succeed!");
            return null;
        }
    }
}
