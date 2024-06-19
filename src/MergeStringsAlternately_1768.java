import java.util.Arrays;

//Original Problem : https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=programming-skills
// Difficulty: Easy
//Solution: In Progress
public class MergeStringsAlternately_1768 {
    public static void main (String[] args){

        String word1 = "abc";
        String word2 = "pqr";

        char [] mergedString = new char[word1.length() + word2.length()];

        int minIndex = Math.min(word1.length(), word2.length());

        String longerString = word1.length() > word2.length() ? word1 : word2;

        int index = 0;
        int indexMergedString = 0;

        while(indexMergedString < mergedString.length && indexMergedString < minIndex)
        {
            mergedString[indexMergedString] = word1.charAt(index);

            indexMergedString++;

            mergedString[indexMergedString] = word2.charAt(index);

            indexMergedString++;
            index++;
        }

        System.out.println(Arrays.toString(mergedString));

    }
}
