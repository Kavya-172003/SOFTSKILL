class solutioninfyy
{
    void m1(String s)
{
    String str=" ";
    System.out.println(s);
    // solution
    String x[]=s.split(" ");
    for(int i=0;i<x.length;i++){
        StringBuffer sb=new StringBuffer(x[i]);
        str=str+sb.reverse()+" ";
    }
        System.out.println(str.trim());
    }
}
public class stringcls {
    public static void main(String[] args) {
// String s1="TCS";
// String s2="TCS1";
// System.out.println(s1);
// System.out.println(s2);
// System.out.println(s1.hashCode());
// System.out.println(s2.hashCode());

//   String name="kavya";
//   String name1="kavya";
//   String name2=new String("kavya");
// //   == is not used .equals() used
// StringBuffer sb=new StringBuffer("kavya");
// StringBuffer sb1=new StringBuffer("kavya");
// System.out.println(sb.hashCode());
// System.out.println(sb1.hashCode());
// // if(name1.equals(name))
// // System.out.println("equal");
// // else
// // System.out.println("not equal");
String s = "all cow eat grass";
StringBuffer sb = new StringBuffer(s);
System.out.println(sb.reverse());
    }
}
