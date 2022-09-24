import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int c = 0;
        int ans = (x1>99 && x1<1000 && x1%5 == 0) ? ++c : c;
        int ans1 = (x2>99 && x2<1000 && x2%5 == 0) ? ++c : c;
        int ans2 = (x3>99 && x3<1000 && x3%5 == 0) ? ++c : c;
        if (c >= 2) {
            System.out.println("true");
            }
        else{
            System.out.println("false");
        }
    }
}
