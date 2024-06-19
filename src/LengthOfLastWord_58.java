//Original Problem: https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=programming-skills
// Difficulty: Easy
//Solution: Completed
public class LengthOfLastWord_58 {

    public static void main(String[] args)
    {
        // Test Cases
        String s = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        lengthOfLastWord(s);
        lengthOfLastWord(s2);
        lengthOfLastWord(s3);
    }

    public static int lengthOfLastWord(String s)
    {
        //Trim String and split using delimiter ' '.
        String[] listOfWords = s.trim().split(" ");

        //Identify last Index and put last word in variable.
        String lastWord = listOfWords[listOfWords.length - 1];

        System.out.println("The last word is '" + lastWord + "' with a length of " + lastWord.length());

        return lastWord.length();
    }
}
