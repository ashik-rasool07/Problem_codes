import java.util.*;

public class samestones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] stones = new int[N];
        for (int i = 0; i < N; i++) stones[i] = sc.nextInt();

        int pos1 = 0, pos2 = 0; 

      
        do {
            System.out.println(stones[pos1] + " " + stones[pos2]);
            pos1 = (pos1 + 1) % N;
            pos2 = (pos2 + 2) % N;
        } while (pos1 != pos2);

        System.out.println(stones[pos1] + " " + stones[pos2]);
        sc.close();
    }
}

/*
-----------------------------
QUESTION:

There are N stones arranged as a circle. The weights of the N stones are passed as the input. 
Initially, two boys B1 and B2 stand on the 1st stone. 
Every second, boy B1 jumps one stone and boy B2 jumps two stones. 
The program must print the weights of the stones on which the two boys jump 
until they jump on the same stone.

Boundary Condition(s):
3 <= N <= 1000
1 <= Weight of each stone <= 1000

Input Format:
The first line contains N.
The second line contains N integer values separated by a space.

Output Format:
Each line contains two integer values separated by a space 
representing the weights of the stones on which the two boys jump.

Example Input/Output 1:
Input:
5
10 20 30 40 50

Output:
10 10
20 30
30 50
40 20
50 40
10 10
-----------------------------
*/
