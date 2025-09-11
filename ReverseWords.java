import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = str.length();
        int end = len;

        System.out.print("Reversed words: ");

        
        for (int i = len - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ' || i == 0) {
                int start = (i == 0) ? 0 : i + 1;

               
                for (int j = start; j < end; j++) {
                    System.out.print(str.charAt(j));
                }

                System.out.print(" "); 
                end = i; 
            }
        }

        
        sc.close();
    }
}
