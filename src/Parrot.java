public class Parrot extends Birds {
    private int iq = 150;
    String color = "blue";
    String name = "";
    public int getIq(){
        return iq;
    }
public void repeatSpeech () {
    System.out.println("Я умею повторять слова, скажи что-нибудь:");
    String speech = in.nextLine();
    System.out.println( "'" + speech + "' - " + name +" умный попугай!");
}
@Override
    public void food(){
    System.out.println("Питаюсь кормом, фруктами и овощами");
}
@Override
public void movement() {
    System.out.println("Летаю, прыгать умею");
}
}

