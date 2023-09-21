import FunctionExamples.AddFunction;
import FunctionExamples.ApplyToNumber;
import FunctionExamples.MultiplyFunction;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Program!");
        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("One", 1);
        newMap.put("Two", 2);
        newMap.put("Three", 3);
        newMap.put("Four", 4);
        newMap.forEach((key, value) -> printPair(key, value));
        ApplyToNumber multFunction = new MultiplyFunction();
        ApplyToNumber addFunction = new AddFunction();
        int[] input = {1, 2, 3, 4};
        int val = 2;
        System.out.println("----------");
        System.out.println("Input: " + Arrays.toString(input) + " Val: " + val);
        System.out.println("Multiply Function Output: " + Arrays.toString(performOperation(input, multFunction, val)));
        System.out.println("Input: " + Arrays.toString(input) + " Val: " + val);
        System.out.println("Add Function Output: " + Arrays.toString(performOperation(input, addFunction, val)));

    }
    private static int[] performOperation(int[] numbers, ApplyToNumber function, int val) {
        int[] results = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
          results[i] = function.apply(numbers[i], val);
       }
        return results;
    }
    private static void printPair(String key, Integer value) {
       System.out.println("Key: " + key + "Value: " + value);
    }
}