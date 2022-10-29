public class Penguin extends Birds {
private String mainEnemy = "морской котик";
private int maxAge = 30;
    public String getMainEnemy() {
        return mainEnemy;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void diving(){
    System.out.println("Ныряем на глубину до 100, а иногда даже до 500 метров");
    }
    @Override
    public void food() {
        System.out.println("Ничего кроме льда и рыбы от роду не видел...");
    }

    @Override
    public void movement() {
        System.out.println("Летать не умею и бегаю тоже так себе, но нырок и плавец я превосходный");
    }

}
