import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

//        String[] words = {"A", "B","C", "d", "f", "u", "H", "I", "j", "k", "l", "n", "o", "p"};
//        BinarySearch searcher = new BinarySearch<>(words);
//        System.out.println(searcher.binarySearch("H", 0, words.length-1));


        MyArrayList<String> list = new MyArrayList<>();
        MyArrayList<String> list1 = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("qwe");
        list.add("qert");
        list.add("rty");
        list.add("fkpd");

        list1.add("qwe1");
        list1.add("qert1");
        list1.add("rty1");
        list1.add("fkpd1");


        list.set(4, "hello");
        list.set(12, "world!");

        list.addAll(list1);

        System.out.println(list.indexOf("1"));
        System.out.println(list.contains("Woryue"));

        for (Object s : list) {
            System.out.println(s);
        }

    }
}

class BinarySearch<T extends Comparable<T>> {

    T[] array;
    public BinarySearch(T[] a) {
        array = a;
    }

    public int binarySearch(T key, int low, int high) {

        if (low > high) throw new IllegalArgumentException("Low > hi!");
        if (low < 0 || high >= array.length) throw new IllegalArgumentException("Incorrect indexes");
        int mid = 0;
        int iters = 0;
        while (low <= high) {
            ++iters;
            mid = (low + high) / 2;
            T value = array[mid];
            if (key.compareTo(value) == 0) {
                return mid;
            }
            if (key.compareTo(value) > 0) low = mid + 1;
            else high = mid - 1;
        }
        //System.out.println(iters);
        return -(low + 1);
    }
}