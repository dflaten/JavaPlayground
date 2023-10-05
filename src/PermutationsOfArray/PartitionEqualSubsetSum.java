package PermutationsOfArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem: Given an integer array return `true` if you can partition the array into two subsets such that the sum of
 *          the elements in both subsets is equal or `false` if otherwise.
 */
public class PartitionEqualSubsetSum {
    static Boolean[][] mem;
    static ArrayList<int []> results;
    public static boolean canPartition(int[] numberArray) {
        results = new ArrayList<>();
        int length = numberArray.length;
        int sum = 0;
        //Determine sum of all numbers
        for (int i: numberArray) {
            sum = sum + i;
        }
        // If the sum is odd we can't partition the list
        if (sum % 2 != 0) {
            return false;
        }

        // We are dividing the sum in 2 because we just need to find one subsequence which is sum/2 because the sum of
        // the other elements must be equal to sum/2 as well.
        sum = sum / 2;

        // Here we are storing the results for each partition.
        // The index of the first array will always between 0 and the length of the array since it is storing the validity
        // of the result.
        // The second array, will be anywhere between 0 and the sum since the sum will always be at the most its current
        // value.
        mem = new Boolean[length][sum + 1];

        return determineSubSetSum(numberArray, 0, sum);
    }

    private static boolean determineSubSetSum(int[] numberArray, int position, int sum) {
        // Base case, we have found the sum that adds up to this value in a previous iteration
        // `sum - numberArray[position]` has passed 0 into the method.
        if (sum == 0) {
            return true;
        }
        //
        else if (position >= numberArray.length || sum < 0) {
            return false;
        }
        // Use our memoization
        if (mem[position][sum] != null) {
            return mem[position][sum];
        }
                                    // These two calls are where we are recursively creating subsequences of the array.
                                    // Here we are making a call where we do take the current item. We are "taking" it
                                    // by removing it from the sum.
        return mem[position][sum] = determineSubSetSum(numberArray, position + 1, sum - numberArray[position]) ||
                                    // Here we are first making a call where we don't take the current item, we move to
                                    // the next position but subtract the current item value from the sum.
                                    determineSubSetSum(numberArray, position + 1, sum);

    }
}
