import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[] array = new byte[n];
        for (byte i = 0; i < n; i++) {
            boolean b = in.nextBoolean();
            int myByte = (!b) ? 0 : 1;
            array[i] = (byte) (myByte | i);
        }
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            boolean b = (i & (1 << j)) != 0;
            System.out.print(b + " ");
            ++j;
        }
    }
}
