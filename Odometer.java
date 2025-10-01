import java.util.*;

public class Odometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        int k = sc.nextInt();

        int n = s.length() / 3;
        int[] parts = new int[n];

        // split into 3-digit numbers
        for (int i = 0; i < n; i++) {
            parts[i] = Integer.parseInt(s.substring(i * 3, (i + 1) * 3));
        }

        // simulate k seconds
        for (int sec = 0; sec < k; sec++) {
            // increment every chunk independently
            for (int i = 0; i < n; i++) {
                parts[i]++;
                if (parts[i] == 1000) {
                    parts[i] = 0; // roll over like an odometer
                }
            }

            // build new string with leading zeros
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(String.format("%03d", parts[i]));
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}
