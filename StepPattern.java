import java.util.*;

public class StepPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String prev = ""; // to store previous line content

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            // Append previous line first
            if (!prev.isEmpty()) sb.append(prev).append(" ");

            // Append current 1..i
            for (int j = 1; j <= i; j++) {
                sb.append(j).append(" ");
            }

            // Trim last space and print
            prev = sb.toString().trim();
            System.out.println(prev);
        }
        sc.close();
    }
}


/*
QUESTION:

The program must accept an integer N as input and print the step increasing pattern.

Input Format:
The first line contains N.

Output Format:
Print N lines containing the step pattern.

Example Input/Output 1:
Input:
4
Output:
1
1 1 2
1 1 2 1 2 3
1 1 2 1 2 3 1 2 3 4
*/
