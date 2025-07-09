class a{
    int x=10;
    void m1(){
        System.out.println("m1 is fun");
    }
}
class b extends a{

}
class c extends b{

}
public class multilevelinheri{
    public static void main(String[] args) {
        a d=new a();
        System.out.println(d.x);
        d.m1();
    }
}
