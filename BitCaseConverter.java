
import java.util.Scanner;

public class BitCaseConverter {

    // Applies bits to the string either from start or end
    public static String applyBits(String str, int n, boolean fromEnd) {
        int[] bits = new int[100];
        int c = 0;
        int temp = n;

        // Step 1: Get binary digits (LSB → MSB)
        while (temp > 0) {
            bits[c] = temp % 2;
            temp /= 2;
            c++;
        }

        // Step 2: Reverse bits to get MSB → LSB
        for (int i = 0; i < c / 2; i++) {
            int t = bits[i];
            bits[i] = bits[c - i - 1];
            bits[c - i - 1] = t;
        }

        // Step 3: Pre-fill StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < str.length(); k++) sb.append(' ');

        if (!fromEnd) {
            // Forward application (from start)
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (i < c) {
                    ch = bits[i] == 1 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                }
                sb.setCharAt(i, ch);
            }
        } else {
            // Backward application (from end)
            int j = c - 1;
            for (int i = str.length() - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                if (j >= 0) {
                    ch = bits[j] == 1 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                    j--;
                }
                sb.setCharAt(i, ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();

        String forwardResult = applyBits(str, n, false);
        String backwardResult = applyBits(str, n, true);

        System.out.println(forwardResult);
        System.out.println(backwardResult);

        scanner.close();
    }
}

/*
Problem Statement:
Given a string and an integer n, convert n into binary. 
Use the binary bits to change the case of characters in the string:
- If bit=1 → uppercase
- If bit=0 → lowercase

Two modes:
1. Forward: apply bits from the start of the string.
2. Backward: apply bits from the end of the string.

Remaining characters in the string (beyond the number of bits) stay unchanged.
Example:
Input: "BasketBall", n=23 (binary 10111)
Output:
Forward:  BaSKEtBall
Backward: BaskeTbALL
*/
