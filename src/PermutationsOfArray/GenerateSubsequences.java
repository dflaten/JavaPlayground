package PermutationsOfArray;

import java.util.ArrayList;

public class GenerateSubsequences {

    static ArrayList<int[]> results = new ArrayList<>();
    public static ArrayList<int []> generateSubSequences(int [] numberArray) {
        ArrayList<Integer> buildingArray = new ArrayList<>();
        recGenerateSubSequences(0, numberArray, buildingArray);
        return results;
    }
    private static void recGenerateSubSequences(int index, int [] numberArray, ArrayList<Integer> subSequence) {
       // Base Case: if we get to the end of the list we are done generating a new subsequence
        System.out.println("Current index: " + index);
        System.out.println("Current subsequence: " + subSequence);
       if (index >=  numberArray.length) {
           results.add(subSequence.stream().mapToInt(i -> i).toArray());
           return;
       }
       subSequence.add(numberArray[index]);
       // Generate subsequences while "taking" the current index
       recGenerateSubSequences(index + 1, numberArray, subSequence);
       // We remove the current index because we are not taking it.
       subSequence.remove(subSequence.size() - 1);
       // Here we are "not taking" the item at the current index
       recGenerateSubSequences(index + 1, numberArray, subSequence);


    }
}
