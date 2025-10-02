import java.util.Scanner;

public class DigitRepeatSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.nextLine();

        long total = 0;
        StringBuilder expression = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char d = s.charAt(i);
            int repeat = d - '0';

            // build new string by concatenation
            String numStr = s.substring(0, i) 
                          + String.valueOf(d).repeat(repeat) 
                          + s.substring(i + 1);

            long val = Long.parseLong(numStr);
            total += val;

            expression.append(val);
            if (i < s.length() - 1) {
                expression.append(" + ");
            }
        }

        System.out.println(expression + " = " + total);
        sc.close();
    }
}

/*
Question:
Write a Java program that takes a number as input.
For each digit d in the number, repeat that digit exactly d times while keeping
the rest of the digits the same. Form new numbers this way for every digit,
then output the expression of all numbers added together along with the final sum.

Example:
Input: 243
Output: 2243 + 244443 + 24333 = 271019

Input: 56
Output: 555556 + 5666666 = 6222222
*/
