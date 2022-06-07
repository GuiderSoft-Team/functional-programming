package day068;

public class MainLambdaRet {
    public static void main(String[] args) {
        Square kare=(v)->v*v;
        int calc = kare.calc(5);
        System.out.println(calc);


        Square k2=new Square() {
            @Override
            public int calc(int value) {
                return value*value;
            }
        };
        System.out.println(k2.calc(3));
    }
}
