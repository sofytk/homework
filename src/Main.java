public class Main {
    public static void main(String[] args) {
        Penguin snezhana =  new Penguin();
        Parrot arkady =  new Parrot();
        ostrich jack =  new ostrich();
        Birds peter =  new Birds();
        Birds[] zoo = new Birds[4];
        zoo[0] = snezhana;
        zoo[1] = arkady;
        zoo[2] = jack;
        zoo[3] = peter;
        for (Birds aboutParrots: zoo) {
            aboutParrots.food();
        }

    }

}
