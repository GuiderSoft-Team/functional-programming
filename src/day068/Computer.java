package day068;

public record Computer(String vendor,int year) implements Printable{

    public void print(){
        System.out.println(this);
    }
}
