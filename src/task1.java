import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 1;
        int f2 = 0;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = f1 + f2;
            f2 = f1;
            f1 = ans;
        }
        System.out.println(ans);
    }

}
