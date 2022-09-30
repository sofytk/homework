import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String n1 = String.valueOf(n);
        int min = n%10;
        for (int i = 0; i < n1.length(); i++) {
            if (n%10 != 0 && n%10<min)  min = n%10;
            n /= 10;
        }
        System.out.println(min);


    }

}
