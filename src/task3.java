import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        // Объявление и создание массива
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println();
        // Поиск минимального и максимального значений
        int min = array[0];
        int imin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }
        }
        System.out.println(min);




    }
}




