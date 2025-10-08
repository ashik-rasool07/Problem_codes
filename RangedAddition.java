import java.util.*;
import java.math.BigInteger;

public class RangedAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of ranges
        int N = sc.nextInt();

        // Step 2: Variable to store the total sum
        BigInteger totalSum = BigInteger.ZERO;

        // Step 3: Process each range
        for (int i = 0; i < N; i++) {
            String range = sc.next();           // e.g., "5-9"
            String[] parts = range.split("-");  // split into X and Y
            int X = Integer.parseInt(parts[0]);
            int Y = Integer.parseInt(parts[1]);

            StringBuilder num = new StringBuilder();

            // Step 4: Concatenate numbers from X to Y
            if (X <= Y) {
                for (int j = X; j <= Y; j++) {
                    num.append(j);
                }
            } else { // if X > Y, reverse direction
                for (int j = X; j >= Y; j--) {
                    num.append(j);
                }
            }

            // Step 5: Convert concatenated string to BigInteger
            BigInteger current = new BigInteger(num.toString());

            // Step 6: Add to total sum
            totalSum = totalSum.add(current);
        }

        // Step 7: Print final sum
        System.out.println(totalSum);
        sc.close();
    }
}


/*
-------------------------------------------
QUESTION:

The program must accept N ranges as the input. 
For each range X–Y, the program must form an integer by concatenating the digits from X to Y.
Then the program must print the sum of those N integers as the output.

Boundary Conditions:
2 <= N <= 100
0 <= X, Y <= 9

Input Format:
- The first line contains an integer N.
- The second line contains N ranges separated by a space.

Output Format:
- Print a single integer representing the sum of the N resulting integers.

Example Input/Output 1:
Input:
3
5-9 2-0 7-9

Output:
57788

Explanation:
5-9 -> 56789
2-0 -> 210
7-9 -> 789
Sum = 56789 + 210 + 789 = 57788

Example Input/Output 2:
Input:
4
0-9 9-0 5-1 1-5

Output:
10000066665

Explanation:
0-9 -> 0123456789
9-0 -> 9876543210
5-1 -> 54321
1-5 -> 12345
Sum = 0123456789 + 9876543210 + 54321 + 12345 = 10000066665
-------------------------------------------
*/
