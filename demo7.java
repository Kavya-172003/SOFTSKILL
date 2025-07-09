class demo6 {
    void m1() {
        // boolean
        boolean input = false;
        {
            input = true;
        }
        if (input == true) {
            System.out.println("input is true");
        }
    }
}

public class demo7 {
    public static void main(String[] args) {
        demo6 d = new demo6();
        d.m1();  // Corrected method call
    }
}
