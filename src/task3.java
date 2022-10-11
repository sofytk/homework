import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int k = 1;
        int max = n * n;
        int j0 = 0, jlast = n - 1;
        int i0 = 0, ilast = n - 1;

        while (k <= max) {
            for (int i = i0; k <= max && i <= ilast; i++) {
                a[j0][i] = k++;
            }
            j0++;
            for (int i = j0; k <= max && i <= jlast; i++) {
                a[i][ilast] = k++;
            }
            ilast--;
            for (int i = ilast; k <= max && i >= i0; i--) {
                a[jlast][i] = k++;
            }
            jlast--;
            for (int i = jlast; k <= max && i >= j0; i--) {
                a[i][i0] = k++;
            }
            i0++;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}