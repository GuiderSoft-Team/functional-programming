package day068;

public class MainImpl {
    public static void main(String[] args) {
        printThing(new Car("Honda",5000));
        printThing(new Book("Java 8",50));
        printThing(new Animal("Aslan",12));
        //System.out.println();
        printThing(new Computer("Asus",2019));
        //new Computer("HP",2021).print();
    }

    public static void printThing(Printable thing){
        thing.print();
    }
}
