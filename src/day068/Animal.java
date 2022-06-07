package day068;

public record Animal(String name,int age) implements Printable {
    @Override
    public void print() {
        System.out.println(this);
    }
}
