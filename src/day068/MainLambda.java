package day068;

public class MainLambda {
    public static void main(String[] args) {
        Printable printableKuzu=()-> System.out.println("Mee");
        printThing(printableKuzu);
        printThing(()-> System.out.println("Hav hav"));


        Printable printableKedi=()-> {
            System.out.println("-".repeat(20));
            System.out.println("Miyav");
            System.out.println("-".repeat(20));
        };

        printThing(printableKedi);
    }

    public static void printThing(Printable thing){
        thing.print();
    }
}
