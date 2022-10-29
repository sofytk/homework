import java.util.Scanner;

public class Birds {
    Scanner in = new Scanner(System.in);
    protected int wings = 2;
    int size = 15;
    private int beak = 1;

    public int getWings() {
        return wings;
    }

    public String singSong (){
        return "Ла ла ла ла ла лаа лаа лааааааа";
    }
    public void food (){
        System.out.println("Питаются насекомыми и зернами");
    }

    public void movement() {
        System.out.println("Летаю обычно");
    }
}
