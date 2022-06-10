package day071;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class FuncApp {
    public static void main(String[] args) {
        Function<Integer,String> gen=s-> "A-"+s;
        System.out.println(gen.apply(30));
    }
}
