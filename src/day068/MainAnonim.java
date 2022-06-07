package day068;

public class MainAnonim {
    public static void main(String[] args) {
        Printable printableKuzu=new Printable() {
            @Override
            public void print() {
                System.out.println("Meee");
            }
        };

        printThing(printableKuzu);
        printThing(new Printable() {
            @Override
            public void print() {
                System.out.println("Hav hav");
            }
        });
    }


    public static void printThing(Printable thing){
        thing.print();
    }
}
