import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = in.nextInt();
        for (int i = 1; ; i++) {
            if (n%10 == num){
                System.out.println( n/(Math.pow(10, i)) );
                System.out.println(n%(Math.pow(10, i-1)));
                break;
            }
            else {
                n /= 10;
               // System.out.println(n);
            }
        }

    }
}
