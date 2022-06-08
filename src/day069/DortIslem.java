package day069;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class DortIslem {
    public static int topla(int x, int y){
        return x+y;
    }

    public static float topla(float x,float y){
        return x+y;
    }


    public static void main(String[] args) {

        //Tamsayı
        BiFunction<Integer,Integer,Integer> toplam=DortIslem::topla;
        Integer t = toplam.apply(5, 7);
        System.out.println("Toplam = "+t);

        //Float sayı
        BiFunction<Float,Float,Float> tpl=DortIslem::topla;
        Float t2 = tpl.apply(2.3F, 3.2F);
        System.out.println("Toplam = "+t2);
    }
}
