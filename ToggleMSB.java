import java.util.*;

public class ToggleMSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum += toggleMSB(arr[i]);  
        }

        System.out.println("The toggled sum of array is" +sum);
    }

    public static int toggleMSB(int number) {
        int msb = 1;

        
        while(msb <= number) {
            msb = msb * 2;
        }
        msb = msb / 2;

        number = number ^ msb;  
        return number;
    }
}
