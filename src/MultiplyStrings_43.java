// Original Problem: https://leetcode.com/problems/multiply-strings/?envType=study-plan-v2&envId=programming-skills
// Difficulty: Medium
// Solution: In Progress

import java.util.Arrays;

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

        //Array of Char Numbers
        char[] digits1 = num1.toCharArray();
        char[] digits2 = num2.toCharArray();

        int maxDigits  = Math.max(num1.length(), num2.length());

        String[] numbersToAdd = new String[maxDigits];

        //Indexes
        int indexOfDigits1 = digits1.length - 1;
        int indexOfDigits2;

        // GET INITIAL NUMBERS
        for(; indexOfDigits1 >= 0 ;indexOfDigits1--)
        {
            indexOfDigits2 = digits2.length - 1;

            int residue = 0;
            int calculation;
            String lineOfDigistToAdd = "";

            for(; indexOfDigits2 >= 0;indexOfDigits2--)
            {
                int number1 = Character.getNumericValue(digits1[indexOfDigits1]);
                int number2 = Character.getNumericValue(digits2[indexOfDigits2]);
                System.out.println(number1 + "-" + number2);

                calculation  = (number1 * number2) + residue;

                if(indexOfDigits2 != 0 && calculation >= 10)
                {
                    residue = calculation / 10;
                    calculation = (int) Math.round(((double)calculation / 10.0  - (double)residue) * 10);
                    System.out.println("Calculation " + calculation);
                    System.out.println("Residue " + residue);
                }else{
                    //WHOLE NUMBER NO REMAINDER
                    System.out.println("Calculation " + calculation);
                }
                //HERE IS WHERE I ADD THE STRING NUMBER TO THE FINAL STRING.
                lineOfDigistToAdd = calculation + lineOfDigistToAdd;
            }




            //TECHNICALLY THIS COUNTS AS ONE LINE OF DIGITS TO ADD AT THE END.
            System.out.println("Line of Digits to add " + lineOfDigistToAdd);
            numbersToAdd[maxDigits - 1] = lineOfDigistToAdd;
            maxDigits--;
            System.out.println("===============");

        }

        // Add missing Zeros for the calculation.
        System.out.println(Arrays.toString(numbersToAdd));
        int maxZeros  = numbersToAdd.length - 1;

        for (int i = 0; i < numbersToAdd.length; i++)
        {
            numbersToAdd[i] = numbersToAdd[i] + "0".repeat(maxZeros);
            maxZeros--;
        }

        System.out.println(Arrays.toString(numbersToAdd));

        //Add numbers and return final result.

        int result = 0;

        for(String numberString : numbersToAdd)
        {
            int number = Integer.parseInt(numberString);
            result += number;
        }

        System.out.println(result);

        return result + "";
    }
}

