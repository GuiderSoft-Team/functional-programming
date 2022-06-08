package day069;

public record Car(String name, double price) implements Runnable {

    public Car(){
        this("Car",0.0);
    }

    @Override
    public void run() {
        System.out.println(this);
    }
}
