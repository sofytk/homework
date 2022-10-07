import java.util.Scanner;

public class NumberDigits {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println( sumOfSeven(a, b));
        }
        public static int sumOfSeven(int a, int b){
            int result = 0;
            for (int i = a; i < b; i++) {
                if (i % 7 == 0 && i>9 && i<100) {
                    result+=i/10+i%10;
                }
            }
            return result;
        }
    }
