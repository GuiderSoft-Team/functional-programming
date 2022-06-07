package day068;

public class Main {
    public static void main(String[] args) {
/*
        int a=5;
        int b=4;
        int c=a+b;//lazy eval





        Aritmetik art=new Aritmetik(5, 3);


        int topla = art.topla();
        System.out.println(topla);*/

        Araba a1=new Araba("Toyota");
        Araba a2=a1;
        Araba[] arabalar=new Araba[10];
        for (int i = 0; i < arabalar.length; i++) {
            arabalar[i]=a1;
        }
        arabSur(a1);
        System.out.println(a1.getName());

    }

    public static void arabSur(Araba araba){
        System.out.println(araba.getName()+" ilerliyor.");
        araba=null;
        araba.getName();
    }

}

class Araba{
    private final String  name;

    public Araba(String  name) {
        this.name = name;
    }

    public String  getName() {
        return name;
    }


}


class Aritmetik{
    private final int x;
    private final int y;

    Aritmetik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int topla(){

        return x+y;
    }

}