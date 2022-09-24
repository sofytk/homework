import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        if ((x<=-2 && x<=3) | (x>=6 && x<=9)){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }

    }
}
