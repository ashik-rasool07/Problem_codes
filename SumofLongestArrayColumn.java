import java.util.*;

public class SumofLongestArrayColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); // consume newline

        int maxlength = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\\s+");

            int maxSum = 0, len = parts.length;

            for (String num : parts) {
                maxSum += Integer.parseInt(num); 
            }

            if (len > maxlength || (len == maxlength && maxSum > sum)) {
                maxlength = len;  
                sum = maxSum;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}

/*
QUESTION:
The program must accept N arrays of integers of different sizes as the input. 
The program must print the sum of integers in the longest array as the output. 
If two or more arrays have the same longest length, then consider the array having the maximum sum.

Boundary Condition(s):
1 <= N <= 50
1 <= Each integer value <= 10^5

Input Format:
The first line contains N.
The next N lines, each contains integer values separated by a space.

Output Format:
The first line contains an integer value representing the sum of integers in the longest array.

Example Input/Output 1:
Input:
5
12 10 50 30
500 800 900
1 2 3 4 5
10 20
15 320 5 15

Output:
15

Explanation:
The longest array among the given 5 arrays is [1 2 3 4 5].
The sum of integers in the array is 15.
*/
