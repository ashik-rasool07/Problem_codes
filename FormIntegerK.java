import java.util.Scanner;

public class FormIntegerK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextLong();

        int bits[] = new int[n];

        for(int i = 0; i < n; i++) {
            long num = arr[i];
            for(int j = 0; j < i; j++) {
                num /= 2; // divide i times to bring (i+1)th bit to LSB
            }
            bits[i] = (int)(num % 2); // extract the bit
        }

        long sum = 0;
        for(int i = 0; i < n; i++) { // build number from MSB to LSB
            sum = sum * 2 + bits[i];
        }

        System.out.print(sum);
        sc.close();
    }
}

/*
Question Description:

The program must accept N integers as the input. The program must form an integer K whose binary representation is formed by choosing the Xth bit from the LSB (Least Significant Bit) of the Xth integer among the N integers, where X represents the position of the integer. Then the program must print the integer K as the output.

Boundary Condition(s):
1 <= N <= 50
1 <= Each integer value <= 10^18

Input Format:
The first line contains N.
The second line contains N integer values separated by a space.

Output Format:
The first line contains K.

Example Input/Output:

Input:
5
6 10 15 2 16

Output:
22

Explanation:
Here N = 5.

1st integer: 6 -> 00110 -> 0
2nd integer: 10 -> 01010 -> 1
3rd integer: 15 -> 01111 -> 1
4th integer: 2 -> 00010 -> 0
5th integer: 16 -> 10000 -> 1

K = 10110 (binary) = 22 (decimal)
*/
