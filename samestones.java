import java.util.*;

public class samestones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // number of stones
        int[] stones = new int[N];  // weights of stones

        for (int i = 0; i < N; i++) {
            stones[i] = sc.nextInt();
        }

        int pos1 = 0, pos2 = 0; // both start at stone 1 (index 0)

        while (true) {
            // print current positions
            System.out.println(stones[pos1] + " " + stones[pos2]);

            // stop condition: both meet again (but not at very beginning)
            if (pos1 == pos2 && !(pos1 == 0 && pos2 == 0)) {
                break;
            }

            // move boys in circular way
            pos1 = (pos1 + 1) % N; // B1 jumps 1 stone
            pos2 = (pos2 + 2) % N; // B2 jumps 2 stones
        }
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
