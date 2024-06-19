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
        int indexOfDigits2;

        // GET INITIAL NUMBERS
        for(; indexOfDigits1 >= 0 ;indexOfDigits1--)
        {
            indexOfDigits2 = digits2.length - 1;

            for(; indexOfDigits2 >= 0;indexOfDigits2--)
            {
                int number1 = Character.getNumericValue(digits1[indexOfDigits1]);
                int number2 = Character.getNumericValue(digits2[indexOfDigits2]);
                System.out.println(number1 + "-" + number2);

                int residue = 0;
                int calculation = 0;

                //STILL NEED TO REORGANIZE THIS.
                calculation  = (number1 * number2) + residue;


                if(indexOfDigits2 != 0)
                {
                    residue = calculation / 10;
                    calculation = (int) ((double)calculation % 10 - residue * 10); //ERROR HERE IN THIS CALCULATION. i AM NOT GETTING DESIRED RESULT.
                    System.out.println("Calculation " + calculation);
                    System.out.println("Residue " + residue);
                }else{
                    //WHOLE
                    System.out.println("Calculation " + calculation);
                }
                //otherwise do the normal way.



            }
            //TECHNICALLY THIS COUNTS AS ONE LINE OF DIGITS TO ADD AT THE END.
            numbersToAdd[indexOfDigits1] = "something here the final result to add";
            System.out.println("===============");

        }

        // Add the numbers you got from previous step.

        return "";
    }
}

