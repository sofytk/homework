import java.util.Scanner;

public class myArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
        }
        System.out.println( avgOf4Digit(b));
    }
    public static double avgOf4Digit(int[] b){
        int result = 0;
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if ( b[i]>999 && b[i]<10_000) {
                result+=b[i];
                count++;
            }
        }
        if (result == 0) return -1;
        else return result/count;
    }




}
