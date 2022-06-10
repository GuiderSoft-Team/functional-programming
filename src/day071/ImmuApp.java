package day071;

public class ImmuApp {
    public static void main(String[] args) {
        Book book = new Book("Java 8", 35.7);

    }
}

final class Book {
    private final String name;
    private final double price;

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

