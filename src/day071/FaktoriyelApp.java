package day071;

public class FaktoriyelApp {
    public static void main(String[] args) {
        //5! hesabı
        int f=1;
        for (int i = 1; i <=5 ; i++) {
            f*=i;
        }
        System.out.println("5! = "+f);
        System.out.println();
        System.out.println("5!= "+faktoriyel(5));

    }

    public static int faktoriyel(int x){
        if (x==0 | x==1) return 1;
        return x* faktoriyel(x-1);
    }
}
