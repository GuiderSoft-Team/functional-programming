package day069;

public class CompareApp {
    public static void main(String[] args) {
        ICompare comp=(s1,s2)->s1.equalsIgnoreCase(s2);
        boolean result = comp.compare("Ahmet", "ahmet");
        System.out.println(result);

        //Metot referansı ile
        ICompare cmp= String::equalsIgnoreCase;
        print(cmp,"Ali","ALİ");


        print((s1,s2)->s1.equalsIgnoreCase(s2),"Osman","OSMAN");
        System.out.println(comp.toString());
        System.out.println("--------------------------");
        ICompare ic=new ICompare() {
            @Override
            public boolean compare(String a, String b) {
                return false;
            }
        };

        System.out.println(ic);

        System.out.println("-----------------------");
        System.out.println(new Book());

    }

    public static void print(ICompare ic,String val1,String val2){
        System.out.println(ic.compare(val1,val2));
    }
}

class Book{

}
