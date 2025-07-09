import java.util.Scanner;
public class Demo1 {
    Scanner sc = new Scanner(System.in);
    int a = 2, b = 3;

    void m1() {
        System.out.println("Enter a value:");
        a = sc.nextInt();
        System.out.println("Enter b value:");
        b = sc.nextInt();
    }

    void m2() {
        System.out.println("Sum: " + (a + b));
        System.out.println("m1 is fun");
    }
public static void main(String args[]) {
        System.out.println("hey");
        Demo1 d = new Demo1();
        d.m1();
        d.m2();
        
    }
}