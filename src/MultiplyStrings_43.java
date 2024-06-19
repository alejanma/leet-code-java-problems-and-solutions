// Original Problem: https://leetcode.com/problems/multiply-strings/?envType=study-plan-v2&envId=programming-skills
// Difficulty: Medium
// Solution: In Progress

public class MultiplyStrings_43 {
    public static void main(String[] args) {
        // Test Cases
        String num1 = "3872";
        String num2 = "23";

        String num3 = "498828660196";
        String num4 = "840477629533";

        System.out.println(multiply(num1,num2));
        //System.out.println(multiply(num3,num4));

    }

    public static String multiply(String num1, String num2) {

        //Identify which string has the most digits.
        //int topNumbers = Math.max(Integer.parseInt(num1) , Integer.parseInt(num2));
        //int lowerNumbers = Math.min(Integer.parseInt(num1) , Integer.parseInt(num2));

        //Array of Char Numbers
        char[] digits1 = new char[num1.length()];
        char[] digits2 = new char[num2.length()];
        digits1 = num1.toCharArray();
        digits2 = num2.toCharArray();

        //String of Numbers to add for second step. useless need to have a loop to create strings for number lines additions.
        //you can create an array of string, and we can already calculate the number of string to insert.
        String[] numbersToAdd = new String[digits1.length];

        //Indexes
        int indexOfDigits1 = digits1.length - 1;
        int indexOfDigist2;

        // GET INITIAL NUMBERS
        for(; indexOfDigits1 >= 0 ;indexOfDigits1--)
        {
            indexOfDigist2 = digits2.length - 1;

            for(; indexOfDigist2 >= 0;indexOfDigist2--)
            {
                System.out.println(digits1[indexOfDigits1] + "-" + digits2[indexOfDigist2]);
                //If index2 is 0 then use the whole number.

                //otherwise do the normal way.


                int residue = 0;
                int calculation = 0;
            }
            //TECHNICALLY THIS COUNTS AS ONE LINE OF DIGITS TO ADD AT THE END.
            numbersToAdd[indexOfDigits1] = "something here the final result to add";
            System.out.println("===============");

        }

        // Add the numbers you got from previous step.

        return "";
    }
}

