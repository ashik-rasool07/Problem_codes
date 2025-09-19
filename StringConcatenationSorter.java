import java.util.*;

public class StringConcatenationSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two strings
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // Reverse both strings
        String r1 = new StringBuilder(s1).reverse().toString();
        String r2 = new StringBuilder(s2).reverse().toString();

        // Store all 8 possible concatenations
        List<String> list = new ArrayList<>();
        list.add(s1 + s2);
        list.add(s1 + r2);
        list.add(r1 + s2);
        list.add(r1 + r2);
        list.add(s2 + s1);
        list.add(s2 + r1);
        list.add(r2 + s1);
        list.add(r2 + r1);

        // Sort them
        Collections.sort(list);

        // Print result
        for (String str : list) {
            System.out.println(str);
        }
    }
}

/*
Problem Statement:
The program must accept two string values S1 and S2 as input.
It must generate all 8 possible concatenations:
1. S1 + S2
2. S1 + reverse(S2)
3. reverse(S1) + S2
4. reverse(S1) + reverse(S2)
5. S2 + S1
6. S2 + reverse(S1)
7. reverse(S2) + S1
8. reverse(S2) + reverse(S1)

Finally, print these 8 concatenated strings in lexicographical (sorted) order.
Boundary: 1 <= length of S1, S2 <= 100
*/
