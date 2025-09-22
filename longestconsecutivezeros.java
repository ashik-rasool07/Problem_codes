import java.util.*;

public class longestconsecutivezeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        int maxZeros = 0;
        int[] zerosCount = new int[N];

        // Find longest sequence of zeros in each number's binary representation
        for (int i = 0; i < N; i++) {
            String bin = Long.toBinaryString(arr[i]);
            int count = 0, longest = 0;
            for (char c : bin.toCharArray()) {
                if (c == '0') {
                    count++;
                    longest = Math.max(longest, count);
                } else {
                    count = 0;
                }
            }
            zerosCount[i] = longest;
            maxZeros = Math.max(maxZeros, longest);
        }

        // Print numbers with max consecutive zeros, in reverse order
        for (int i = N - 1; i >= 0; i--) {
            if (zerosCount[i] == maxZeros) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}

/*
The program must accept N integers and print the integers having the longest 
sequence of consecutive zeroes in their binary representation, 
in reverse order of occurrence.

Boundary Condition(s):
1 <= N <= 10^4
1 <= Each integer value <= 10^18

Input Format:
The first line contains N.
The second line contains N integers separated by space.

Output Format:
The first line contains the integers with longest consecutive zeroes,
printed in reverse order of occurrence.

Example Input/Output 1:
Input:
5
9 10 32 65 7

Output:
65 32

Example Input/Output 2:
Input:
4
9 2 5 10

Output:
9
*/
