import java.util.*;

public class characterfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   // input string
        
        int[] freq = new int[256];  // array to store frequency of each character (ASCII size)
        
        // First loop → count how many times each character occurs
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        
        // Second loop → print character and its frequency from right to left
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.print(ch + "" + freq[ch] + " ");
            freq[ch]--;  // decrease count for the next occurrence
        }
        sc.close();
    }
}

/*
The program must accept a string S as the input. 
The program must find the frequency of the characters in the given string in reverse order. 
Then the program must print each character and its frequency till that character from the right.

Boundary Condition(s):
1 <= Length of S <= 1000

Input Format:
The first line contains S.

Output Format:
The first line contains the character-integer pairs representing the characters of the string S 
and their frequencies from the right.

Example Input/Output 1:
Input: 
google
Output: 
g2 o2 o1 g1 l1 e1

Example Input/Output 2:
Input: 
hippopotamus
Output:
h1 i1 p3 p2 o2 p1 t1 a1 m1 u1 s1
*/
