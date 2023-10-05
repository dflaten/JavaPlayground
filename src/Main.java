import HighLevelFunctionExamples.*;
import PermutationsOfArray.GenerateSubsequences;
import PermutationsOfArray.PartitionEqualSubsetSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Program!");
        //System.out.println("Executing Retry");
        //UsingHighLevelFunctions.execute();
        int[] myarray = {1,5,11,5};
        System.out.println("Can partition array: " + Arrays.toString(myarray));
        System.out.println("Result: " + PartitionEqualSubsetSum.canPartition(myarray));
//        int[] smallArray = {3,1,2};
//        System.out.print("Generate Subsequences: " + Arrays.toString(smallArray));
//        System.out.println("Result: ");
//        GenerateSubsequences.generateSubSequences(smallArray).forEach(Main::printArray);

    }
    static private void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}