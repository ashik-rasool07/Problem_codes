import java.util.Scanner;

public class MatrixFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        int maxRow = 0, maxCol = 0;

        // First pass: find max row/col
        int[] rows = new int[tokens.length];
        int[] cols = new int[tokens.length];
        char[] chars = new char[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            // Extract row (leading digits)
            int j = 0;
            while (j < token.length() && Character.isDigit(token.charAt(j))) {
                j++;
            }
            int row = Integer.parseInt(token.substring(0, j));
            char ch = token.charAt(j);  // the character
            int col = Integer.parseInt(token.substring(j + 1));

            rows[i] = row;
            cols[i] = col;
            chars[i] = ch;

            if (row > maxRow) maxRow = row;
            if (col > maxCol) maxCol = col;
        }

        // Create matrix
        char[][] matrix = new char[maxRow][maxCol];

        // Place values
        for (int i = 0; i < tokens.length; i++) {
            matrix[rows[i] - 1][cols[i] - 1] = chars[i];
        }

        // Print
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            sc.close();
 }
 }
}