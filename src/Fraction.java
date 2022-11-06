import java.math.BigDecimal;

public class Fraction {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(2.8);
        Fraction fr = new Fraction(1, 6);

        System.out.println("Сумма двух дробей: " + sumNum + "/" + sumDen);
        System.out.println("Произведение двух дробей: " + multNum + "/" + multDen);

    }
    int numerator;
    static int den;
    static int sumDen = 1;
    static int sumNum;
    static int multDen = 1;
    static int multNum = 1;
    Fraction(int numerator, int denominator) {
        nok(denominator, numerator);
        sum(numerator, denominator);
        mult(numerator, denominator);
    }
    public Fraction(double num) {
        int after = BigDecimal.valueOf(num).scale();
        numerator = (int) (num * (Math.pow(10, after)));
        den = (int) Math.pow(10, after);
        nok(den, numerator);
        mult(numerator, den);
        sum(numerator, den);

    }
    void nok(int denominator, int numerator){
        sumDen *= denominator;
        multNum *= numerator;
    }

    public void sum(int numerator, int denominator) {
        sumNum = (sumDen/denominator) * numerator + multNum/numerator * (sumDen/den);
    }

    public void mult(int numerator, int denominator) {
        multDen = sumDen;
    }
}
