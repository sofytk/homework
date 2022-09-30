import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rabb = 11;
        int wolf = 2;
        int plusw = 0;
        for (int i = 1; i < n + 1; ++i) {
               switch (i % 2) {
                   case 0:
                       rabb -= 10;
                       ++plusw;

                       break;
                   case 1:
                       rabb *= 3;
                       break;
               }
            if (rabb < 10 && rabb>0) --wolf;
            if (plusw % 70 == 0) ++wolf;
           }
           System.out.println(rabb + " " + wolf);


    }

}
