import java.util.Arrays;
import java.util.Scanner;

public class myArrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int b: minToBegin(array)) {
            System.out.print(b + " ");
        }
    }

    public static int[] minToBegin(int[] array ){
        int min = array[0];
        int ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min && array[i] != min){
                min = array[i];
                ind = i;
            }
        }

        for (int i = ind; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = min;
        return array;
    }
}
