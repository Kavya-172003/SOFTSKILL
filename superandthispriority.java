class A{
    int a=10;
    void m1(){
        System.out.println("super class");
    }
}
class B extends A{
    int a=30;
    void m1(){
        System.out.println("child ");
    }
    void logi(){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        this.m1();
        super.m1();
    }
}
public class superandthispriority {
    public static void main(String[] args) {
        B d=new B();
        d.logi(); 
    }
}
