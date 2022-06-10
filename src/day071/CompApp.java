package day071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompApp {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(
                Arrays.asList(1,7,2,8,3,5)
        );
        list.sort((o1, o2) -> o1-o2);
        list.forEach(System.out::println);

    }
}
