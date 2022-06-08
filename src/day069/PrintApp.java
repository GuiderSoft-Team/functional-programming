package day069;

public class PrintApp {
    public static void main(String[] args) {
        Printable p1=new Car();
        p1.print("DDD");
        p1.show();

        Printable p2=new Printable() {
            @Override
            public void print(String value) {
                System.out.println("Merhaba "+value);
            }

            @Override
            public void show() {
                System.out.println("Anonim için gerekn Bilgiler:");
                System.out.println("----------------------------");
            }
        };

        p2.print("Ahmet");
        p2.show();

        Printable p3=x-> System.out.println("Selam "+x);
        p3.print("Mehmet");
        p3.show();

        Printable p4=System.out::println;
        p4.print("Merhaba");
        p4.show();

        p4.draw();

        Printable.draw("x");
    }
}
