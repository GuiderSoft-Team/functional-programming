package day071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReduceApp {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer toplam = list.stream().reduce(0, (a, b) -> a + b);
        list.forEach(System.out::println);
        System.out.println("Toplam = "+toplam);
        Integer carpim = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("5! = "+carpim);
    }
}
