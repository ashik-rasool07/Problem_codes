import java.util.*;

public class Swapclock {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Define the clock as a 5x5 matrix
        String[][] clock = {
            {"*", "11", "12", "1", "*"},
            {"10", "*", "*", "*", "2"},
            {"9", "*", "*", "*", "3"},
            {"8", "*", "*", "*", "4"},
            {"*", "7", "6", "5", "*"}
        };

        // Step 2: Read number of swaps
        int N = sc.nextInt();

        // Step 3: Perform N swaps
        for (int s = 0; s < N; s++) {
            String a = sc.next();  // first number
            String b = sc.next();  // second number

            // Find positions of a and b
            int aRow = -1, aCol = -1;
            int bRow = -1, bCol = -1;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (clock[i][j].equals(a)) {
                        aRow = i; aCol = j;
                    }
                    if (clock[i][j].equals(b)) {
                        bRow = i; bCol = j;
                    }
                }
            }

            // Swap them
            String temp = clock[aRow][aCol];
            clock[aRow][aCol] = clock[bRow][bCol];
            clock[bRow][bCol] = temp;
        }

        // Step 4: Print the final matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(clock[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
QUESTION:

The below 5*5 matrix represents a 12-hour analog clock. 
The asterisks in the clock represent the empty spaces.

* 11 12 1 *
10 * * * 2
9  * * * 3
8  * * * 4
* 7  6  5 *

A boy is playing with the clock and he is swapping the numbers on the clock. 
The program must accept N pairs of integers as the input. 
Each pair represents the numbers swapped by the boy. 
The program must print the clock(matrix) after N swaps as the output.

Boundary Condition(s):
1 <= N <= 50
1 <= Each integer in a pair <= 12

Input Format:
The first line contains N.
The next N lines, each contains a pair of integers separated by a space.

Output Format:
The first five lines contain a matrix representing the clock after N swaps.

Example Input/Output 1:
Input:
3
12 4
9 7
8 12

Output:
* 11 4 1 *
10 * * * 2
7  * * * 3
12 * * * 8
* 9  6  5 *

*/
