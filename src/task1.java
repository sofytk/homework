import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();

        String ans = "";
        int num = String.valueOf(n).length();

        for (int i = num; i > 0; i--) {
            if (n / (int) (Math.pow(10, i - 1)) != h) {
                ans += n / (int) (Math.pow(10, i - 1));
            } else {
                ans += "";
            }
            n %= (int) (Math.pow(10, i - 1));
        }
        System.out.println(ans);


    }
}

