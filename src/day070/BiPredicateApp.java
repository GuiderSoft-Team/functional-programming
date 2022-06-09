package day070;

import java.util.function.BiPredicate;

public class BiPredicateApp {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> big=(i,j)->i>j;
        boolean test = big.test(15, 10);
        System.out.println(test);

        BiPredicate<String,String> contain=(a,b)->a.contains(b);

        boolean test1 = contain.test("Ben bir garip keloğlan", "garip");
        System.out.println("Result =" + test1);

    }
}
