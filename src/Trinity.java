public class Trinity<T extends Comparable> {
    T third;
    T second;
    T first;
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public void maxToMin() {
        while (first.compareTo(second) < 0 ||  first.compareTo(third) < 0 || second.compareTo(third)<0) {
            if (first.compareTo(second) < 0) {
                T a = first;
                first = second;
                second = a;
            }
            if (second.compareTo(third) < 0) {
                T a = second;
                second = third;
                third = a;
            }
            //System.out.println("second " + second + " third " + third);

            if (first.compareTo(third) < 0) {
                T a = first;
                first = third;
                third = a;
            }
        }
    }
    public T getFirst() {
        maxToMin();
        return first;
    }

    public T getSecond() {
        maxToMin();
        return second;
    }

    public T getThird() {
        maxToMin();
        return third;
    }

    public static void main(String[] args) {
        Trinity jj = new Trinity();
        jj.setFirst(7.798907698);
        jj.setSecond(7.0893768967);
        jj.setThird(7.8943975897);
        System.out.println("first ");
        System.out.println(jj.getFirst());
        System.out.println("second ");
        System.out.println(jj.getSecond());
        System.out.println("third ");
        System.out.println(jj.getThird());

    }
}
