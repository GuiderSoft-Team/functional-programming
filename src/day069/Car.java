package day069;

public record Car(String name, double price) implements Runnable,Printable {

    public Car(){
        this("Car",0.0);
    }

    @Override
    public void run() {
        System.out.println(this);
    }

    @Override
    public void print(String value) {
        System.out.println(value+": "+this);
    }

    @Override
    public void show() {
        System.out.println("Araba için gereken bilgiler:");
        System.out.println("----------------------------");
    }
}
