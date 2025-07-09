class demo{
    int a=10;
    void m1(){
        System.out.println("m1 called");
    }
}
class demo1 extends demo{

}
public class inherit {
    public static void main(String[] args) {
        demo d=new demo();
        System.out.println(d.a);
        d.m1();
    }
}
