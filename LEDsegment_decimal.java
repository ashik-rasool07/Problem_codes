import java.util.*;

public class LEDsegment_decimal {
    public static void main(String[] args) {
        String numInLED[] = {
            "1111110","0110000","1101101","1111001","0110011",
            "1011011","1011111","1110000","1111111","1111011"
        };

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        sc.close();

        StringBuilder binary = new StringBuilder();
        for (char ch : number.toCharArray()) {
            binary.append(numInLED[ch - '0']);
        }

        long result = 0, weight = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1')
                result += weight;
            weight *= 2;
        }

        System.out.print(result);
    }
}

/*Given N, replace each digit with its 7-seg binary code   (0→1111110,1→0110000,...,9→1111011), 
concatenate, convert binary to decimal, and print.*/