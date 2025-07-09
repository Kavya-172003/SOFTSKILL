class demo {
    void m1() {
        System.out.println("m1 fun");
    }

    void m2() {
        int a = 10;
        int b = 0;
        System.out.println(a / b); 
    }
}

public class exception1 {
    public static void main(String[] args) {
        System.out.println("Main program start");

        demo d = new demo();
        d.m1();  // safe

        try {
            d.m2();  // risky method call
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main: Cannot divide by zero!");
        }

        System.out.println("Main ends");
    }
}
