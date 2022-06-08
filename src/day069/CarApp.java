package day069;

public class CarApp {
    public static void main(String[] args) {
        Runnable car1=Car::new;



        new Thread(Car::new).start();
    }
}
