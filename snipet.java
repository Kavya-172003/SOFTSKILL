class demo16{
    int x=100;
    void m1(){
        System.out.println(x);
    }
    demo16(){
        System.out.println("demo constructor");
    }
    {
        System.out.println("non static");
    }
    static{
        System.out.println("static ");
    }
}
public class snipet{
    public static void main(String[] args) {
        demo16 n=new demo16();
    }   
}
