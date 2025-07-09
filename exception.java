class demo{
    void m1(){
        try{
        System.out.println("m1 fun");
        System.out.println("division");
        int a=10;
        int b=0;
        System.out.println(a/b);
    }catch (ArithmeticException e){
        System.out.println("loo macha dont divide by zero");
        }
    }
}
public class exception {
    public static void main(String[] args) {
        System.out.println("main program start");
        System.out.println("main ends");
        demo d=new demo();
        d.m1();
    }
}
