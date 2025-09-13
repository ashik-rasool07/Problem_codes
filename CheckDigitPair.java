import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // number of integers
        int arr[] = new int[N];
        boolean found = false;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // create digit signatures
        boolean[][] digitsInNum = new boolean[N][10];
        for (int i = 0; i < N; i++) {
            digitsInNum[i] = getDigit(arr[i]);
        }

        // compare pairs
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Arrays.equals(digitsInNum[i], digitsInNum[j])) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }

    public static boolean[] getDigit(int num) {
        boolean[] digits = new boolean[10];
        while (num > 0) {
            int rem = num % 10;
            digits[rem] = true;
            num /= 10;
        }
        return digits;
    }
}

/*
Problem:
Accept N integers and print all possible pairs (X, Y) 
where both numbers are formed using the same set of digits.
If no such pair exists, print -1.

Example:
Input:
6
134 5489 4413 745 88549 3114

Output:
134 4413
134 3114
5489 88549
4413 3114
*/
