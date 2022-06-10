package day071;

public class PureApp {
    private static int value;
    public static void main(String[] args) {
        int sum = sum(1, sum(2, 3));
        System.out.println(sum);
    }

    public static int sum(int x,int y){
        return x+y;
    }
}
