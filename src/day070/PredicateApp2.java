package day070;

import java.util.function.Predicate;

public class PredicateApp2 {
    public static void main(String[] args) {
        Integer t=15;
        Predicate<Integer> p1= n -> n>10;
        Predicate<Integer> p2=n->n<20;

        Predicate<Integer> p3 = p1.and(p2);
        Predicate<Integer> p4 = p1.or(p2);


        Predicate<Integer> p=n->n>10&n<20;

        System.out.println(p.test(t));


        boolean test = p3.test(t);
        System.out.println("Result = "+test);

        boolean test1 = p4.test(t);
        System.out.println("Result ="+test1);


        Predicate<Integer> negate = p1.negate();
        boolean test2 = negate.test(t);
        System.out.println("Negate = "+test2);

/*
        boolean test1 = p1.test(t);
        boolean test2 = p2.test(t);


        System.out.println(test1);
        System.out.println(test2);*/
    }
}
