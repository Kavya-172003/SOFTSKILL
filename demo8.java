class demo9{
    void m1()
    {
        int a=2,b=3,c=1;
        if(a>b && a>c ||b>c && b>a || c>a && c>b)
        System.out.println(" Is big");
    }
}
public class demo8{
    public static void main(String args[]){
        new demo9().m1();
    }
}