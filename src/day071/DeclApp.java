package day071;

import java.util.Arrays;

public class DeclApp {
    public static void main(String[] args) {
        int[] sayilar={1,2,3,4,5};
        int toplam = Arrays.stream(sayilar).sum();
        System.out.println("Toplam = "+toplam);

        System.out.println();

        System.out.println(Arrays.stream(new int[]{1,2,3,4,5}).sum());
        System.out.println();

        Arrays.stream(sayilar)
                .filter(x->x%2==0)
                .forEach(System.out::println);


    }
}
