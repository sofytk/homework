public class ostrich extends Birds {
    private int speed = 70;
@Override
public void food (){
    System.out.println("Ем всё, что под клюв попадётся");
}
@Override
    public void movement() {
        System.out.println("Летать не умею, но бегаю быстрее всех");
    }
public void isDanger(){
    System.out.println("*голова в песке*");
}
}
