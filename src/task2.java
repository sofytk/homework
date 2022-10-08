import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] A = new int[n][m];
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            if (i%2 == 0){
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = k;
                    k++;
                }
            }
            else{
                for (int j = A[i].length-1; j >= 0; j--) {
                    A[i][j] = k;
                    k++;
                }
            }

        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        }
}
