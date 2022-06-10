package day071;

import java.util.function.Function;

public class ConcatApp {
    public static void main(String[] args) {
        Birlestirici birlestirici= (s1, s2) -> s1+s2;
        Birlestirici brt=(s1,s2)->s1+s2;
        if (birlestirici==brt) System.out.println("İkisi aynı");
        else System.out.println("Ne münasebet");

        String s = birlestirici.birlestir("ABC", "DEF");
        System.out.println(s);

        goster((s1,s2)->s1+s2.repeat(3),"KLM","OÖPR");


    }


    public static void goster(Birlestirici b,String x,String y){
        System.out.println(b.birlestir(x,y));
    }
}

@FunctionalInterface
interface Birlestirici{
    String birlestir(String s1, String s2);
}
