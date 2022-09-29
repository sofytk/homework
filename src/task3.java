import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cakes = (n % 100 > 10 && n % 100 < 20  ? n % 100 : n % 10);
        String result = "TORT";
        switch (cakes) {
                case 1:
                    result += "";
                    break;
                case 2:
                    result += "A";
                    break;
                case 3:
                    result += "A";
                    break;
                case 4:
                    result += "A";
                    break;
                default:
                    result += "OV";

        }
        System.out.println(n + " " + result);

    }
}
