import java.util.*;

public class studentMarksorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of students
        int Q = sc.nextInt();   // number of questions
        int[] marks = new int[Q];
        for (int i = 0; i < Q; i++) {
            marks[i] = sc.nextInt();
        }

        int[] total = new int[N];
        int idx = 0;         // current student index
        int dir = 1;         // 1 means forward, -1 means backward

        for (int i = 0; i < Q; i++) {
            total[idx] += marks[i];

            // Move to next student
            idx += dir;

            // if we reach either end, reverse direction
            if (idx == N) {
                idx = N - 2;
                dir = -1;
            } else if (idx < 0) {
                idx = 1;
                dir = 1;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(total[i]);
            if (i < N - 1) System.out.print(" ");
        }
        sc.close();
    }
}

/*
Question:
In a game, there are N students standing in a row. The class teacher asks Q questions 
to the N students in a zig-zag order (1 to N, then N-1 back to 1, then again 2 to N, etc.). 
Each question has marks. Write a program to calculate and print the total marks 
scored by each student.

Input:
- First line: N
- Second line: Q
- Third line: Q integers (marks for each question)

Output:
- N integers (total marks scored by each student)

Example:
Input:
5
13
6 2 5 1 3 4 7 10 9 8 5 10 7

Output:
15 20 17
*/