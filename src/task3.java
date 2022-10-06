import java.util.Scanner;

public class task3 {
    //Способ с массивом
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i+=1) {
            array[i] = in.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < array[0] && array[i]>=0) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
//Способ без массивов

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int len = in.nextInt();
//        int n = 0;
//        int min = 0;
//        for (int i = 0; i < len; i++) {
//            min = n;
//            n = in.nextInt();
//            if (n < min && n>=0) min = n;
//        }
//        System.out.println(min);
//
//    }
}




