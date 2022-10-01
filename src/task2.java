import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = 0;
        while (n!=0) {
            n1 = n1 * 10 + n % 10;
            n /= 10;
        }
        System.out.println(n1);

    }
}