import java.util.*;

public class MiddleCharMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        sc.nextLine();

        String[] words = new String[N];
        char[] middle = new char[N];

        for (int i = 0; i < N; i++) {
            words[i] = sc.nextLine();
            int mid = words[i].length() / 2;
            middle[i] = Character.toLowerCase(words[i].charAt(mid));
        }

        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            char ch = Character.toLowerCase(str.charAt(i));

            for (int j = 0; j < N; j++) {
                if (ch == middle[j]) {
                    System.out.println(words[j]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                int length = words[0].length();
                for (int k = 0; k < length; k++) {
                    if (k == length / 2)
                        System.out.print(str.charAt(i));
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
