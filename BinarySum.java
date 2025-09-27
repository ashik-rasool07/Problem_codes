import java.util.*;

public class BinarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        long n = sc.nextLong();

        // Convert to binary string
        String bin = Long.toBinaryString(n);

        // Power starts from length-1 (MSB)
        int power = bin.length() - 1;
        boolean first = true; // to avoid leading '+'

        for (int i = 0; i < bin.length(); i++, power--) {
            if (bin.charAt(i) == '1') {
                if (!first) System.out.print("+");
                System.out.print((long)Math.pow(2, power));
                first = false;
            }
        }
        sc.close();
    }
}


/*
QUESTION:

Write a program to express a given number as the sum of powers of 2 
based on its binary representation.

Input Format:
The first line contains an integer N.

Output Format:
Print the equivalent expression using powers of 2, joined by '+'.

Example Input/Output 1:
Input:
10
Output:
8+2

Example Input/Output 2:
Input:
5
Output:
4+1
*/
