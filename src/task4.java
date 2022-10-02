import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    // Способ с массивами
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i+=1) {
            array[i] = in.nextInt();
        }

        for (int i = 1; i < array.length ; i++) {
            int m = array[i-1];
            if (m < array[i] && array[i] != 0) {
                System.out.print(array[i] + " ");

            }
        }
    }
//Способ без массивов
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int len = in.nextInt();
//        int n = 1;
//        int min;
//        for (int i = 0; i<len; i++) {
//            min = n;
//            n = in.nextInt();
//            if (min < n && n!=0) {
//                System.out.print(n + " ");
//            }
//        }
//    }



}
