package day070;

import java.util.Arrays;
import java.util.List;

public class App8 {
    public static void main(String[] args) {
        //show(1,3,6,7,9,10);
        List<Car> carList = getCarList(
                new Car("BMW", 20000),
                new Car("Mercedes", 30000),
                new Car("Honda", 10000)
        );
        carList.stream()
                .filter(item->item.price()>=20000)
                .forEach(System.out::println);

    }


    public static List<Car> getCarList(Car... cars){
        return Arrays.stream(cars).toList();
    }

    public static void show(Integer... numbers){
        Arrays.stream(numbers).forEach(System.out::println);
    }
}

record Car(String name, double price){}
