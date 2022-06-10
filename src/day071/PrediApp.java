package day071;

import java.util.function.Predicate;

public class PrediApp {
    public static void main(String[] args) {
        Predicate<Integer> dv2=x->x%2==0;
        Predicate<Integer> dv5=x->x%5==0;

        boolean dv2_5 = dv2.and(dv5).test(30);
        System.out.println(dv2_5);

        boolean dv = dv2.or(dv5).test(8);
        System.out.println(dv);


    }
}
