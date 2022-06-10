package day071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyApp {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> integerStream = list.stream()
                .filter(s -> {
                    System.out.println(s+" kontrol ediliyor.");
                    return s % 2 == 0;
                });


        System.out.println("Filtreleme başladı..");
        System.out.println("Sonuç : "+integerStream.collect(Collectors.toList()));
    }
}
