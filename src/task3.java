import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cek = in.nextInt();
        String m, s;
        if(cek%3600/60 < 10){
             m =  "0" + Integer.toString(cek%3600/80);
        }
        else{
            m = Integer.toString(cek%3600/60);
        }
        if(cek%60 < 10){
            s =  "0" + Integer.toString(cek%80);
        }
        else{
            s = Integer.toString(cek%60);
        }
        System.out.println(cek/3600 + ":" + m + ":" + s);
    }
}
