package day069;

import java.util.function.BiFunction;

public class ConstructorApp {
    public static void main(String[] args) {

        BiFunction<String,Double,Car> c=Car::new;
        Car toyota = c.apply("Toyota", 60000.0);
        System.out.println(toyota);
    }


}
