package day068;

public class MainLambdaPar {
    public static void main(String[] args) {
        IPrint printDog=(f)-> {
            System.out.println(f);
            System.out.println("Hav hav");
            System.out.println(f);
        };

        printDog.print("***********");
        printDog.print("-----------");
        printDog.print("xxxxxxxxxx");
        //printThing(printDog);

    }

    public static void printThing(IPrint thing){
        thing.print("------------");
    }
}
