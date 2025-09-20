import java.util.*;

public class ReplaceLargestDigitwithBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // number of integers
        long sum = 0;

        for (int i = 0; i < N; i++) {
            String num = sc.next();

            // Step 1: Find largest digit
            char maxDigit = '0';
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) > maxDigit) {
                    maxDigit = num.charAt(j);
                }
            }

            // Step 2: Convert largest digit -> binary (manual)
            int digit = maxDigit - '0';
            String binary = toBinary(digit);

            // Step 3: Replace only first occurrence manually
            String revised = replaceFirstDigit(num, maxDigit, binary);

            // Step 4: Convert to number and add to sum
            sum += Long.parseLong(revised);
        }

        System.out.println(sum);
    }

    // manual decimal -> binary
    static String toBinary(int n) {
        if (n == 0) return "0";
        String result = "";
        while (n > 0) {
            result = (n % 2) + result;
            n = n / 2;
        }
        return result;
    }

    // manual replace first occurrence of a digit
    static String replaceFirstDigit(String num, char target, String replacement) {
        String result = "";
        boolean replaced = false;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (!replaced && c == target) {
                result += replacement; // insert binary
                replaced = true;
            } else {
                result += c; // keep original
            }
        }
        return result;
    }
}

/*
-----------------------------
QUESTION:

The program must accept N integers as the input. For each integer X among the N integers,
the program must replace the largest digit with its binary representation.
Then the program must print the sum of the N revised integers as the output.
If the largest digit occurs more than once in an integer, then consider the first occurrence only.

Boundary Condition(s):
1 <= N <= 100
1 <= Each integer value <= 10^8

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains an integer representing the sum of the N revised integers.

Example Input/Output 1:
Input:
4
204 535 190 99

Output:
150264
-----------------------------
*/
