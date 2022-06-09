package day070;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        //Tick - Timestamp
        Supplier<Long> damga=()->new Date().getTime();

        Long tick = damga.get();
        System.out.println(tick);

        //Metot referansıyla Constructor
        Supplier<Book> k=Book::new;
        Book book = k.get();
        System.out.println(book);

        //static metot referansıyla
        //GUID veya UUID
        Supplier<String> id=SupplierApp::generateId;
        for (int i = 0; i < 5; i++) {
            System.out.println(id.get());
        }


        Supplier<Integer> rnd= ThreadLocalRandom.current()::nextInt;
        for (int i = 0; i < 5; i++) {
            System.out.println(rnd.get());
        }

    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}

class Book{
    private String name;
    private double price;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}