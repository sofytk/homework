import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();

        String ind = "";
        String num = String.valueOf(n);
        int ans = 0;

//        for (int i = 0; i <= num; i++) {
//            if (n%10 == h){
//                ind = i;
//            }
//            n /= 10;
//        }

        for (int i =0; i < num.length(); i++) {
            if (n % 10 != h){
                ans += n%10 * (int)(Math.pow(10, i)) ;
                //System.out.println(ans);
            }
            n /= 10;
        }




        for (char digit : num.toCharArray()) { // cycle through every char
            if(digit!='0') { // if it is not a zero
                ind+=digit; // append it to the resultString
            }
        }
       // if (!ind.equals("")) {
            System.out.println(Integer.parseInt(ind));






//        if (ans!=0 && ans != num-1){
//            System.out.println((int)(ab / Math.pow(10, ans+1) )  + "" +  (int)(ab % Math.pow(10, ans) ) );
//        }
//        else if (ans == num-1){
//            System.out.println((int)(ab % Math.pow(10, num-1) ));
//        }
//        else{
//            System.out.println(ab / 10);
//        }

    }
}

